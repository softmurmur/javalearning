package attempt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Random;

public class snackgam extends JPanel implements ActionListener {

    // 游戏区域大小与格子大小
    private static final int WIDTH = 600;
    private static final int HEIGHT = 600;
    private static final int CELL_SIZE = 25;
    private static final int ROWS = HEIGHT / CELL_SIZE;
    private static final int COLS = WIDTH / CELL_SIZE;

    // 定时器延迟（毫秒），值越小蛇移动越快
    private static final int DELAY = 120;

    // 方向常量
    private enum Direction { UP, DOWN, LEFT, RIGHT }

    private Direction direction = Direction.RIGHT;
    private Direction nextDirection = Direction.RIGHT;

    // 蛇身，列表第一个元素是蛇头
    private final ArrayList<Point> snake = new ArrayList<>();

    // 食物位置
    private Point food;

    private boolean running = false;
    private boolean gameOver = false;
    private int score = 0;

    private final Timer timer;
    private final Random random = new Random();

    public snackgam() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(new Color(30, 30, 30));
        setFocusable(true);

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                handleKey(e.getKeyCode());
            }
        });

        timer = new Timer(DELAY, this);
        startGame();
    }

    // 初始化/重新开始游戏
    private void startGame() {
        snake.clear();
        // 初始蛇身长度为 3，位于中间向左排列
        int startX = COLS / 2;
        int startY = ROWS / 2;
        snake.add(new Point(startX, startY));
        snake.add(new Point(startX - 1, startY));
        snake.add(new Point(startX - 2, startY));

        direction = Direction.RIGHT;
        nextDirection = Direction.RIGHT;
        score = 0;
        gameOver = false;
        running = true;

        spawnFood();
        timer.restart();
        repaint();
    }

    // 随机生成食物，且不与蛇身重叠
    private void spawnFood() {
        while (true) {
            Point p = new Point(random.nextInt(COLS), random.nextInt(ROWS));
            if (!snake.contains(p)) {
                food = p;
                return;
            }
        }
    }

    private void handleKey(int keyCode) {
        switch (keyCode) {
            case KeyEvent.VK_UP:
                if (direction != Direction.DOWN) nextDirection = Direction.UP;
                break;
            case KeyEvent.VK_DOWN:
                if (direction != Direction.UP) nextDirection = Direction.DOWN;
                break;
            case KeyEvent.VK_LEFT:
                if (direction != Direction.RIGHT) nextDirection = Direction.LEFT;
                break;
            case KeyEvent.VK_RIGHT:
                if (direction != Direction.LEFT) nextDirection = Direction.RIGHT;
                break;
            case KeyEvent.VK_SPACE:
                if (gameOver) {
                    startGame();
                } else {
                    // 空格键暂停/继续
                    running = !running;
                    if (running) timer.restart();
                    else timer.stop();
                    repaint();
                }
                break;
        }
    }

    // 定时器触发：移动蛇
    @Override
    public void actionPerformed(ActionEvent e) {
        if (running && !gameOver) {
            move();
        }
        repaint();
    }

    private void move() {
        direction = nextDirection;
        Point head = snake.get(0);
        Point newHead = switch (direction) {
            case UP -> new Point(head.x, head.y - 1);
            case DOWN -> new Point(head.x, head.y + 1);
            case LEFT -> new Point(head.x - 1, head.y);
            case RIGHT -> new Point(head.x + 1, head.y);
        };

        // 撞墙检测
        if (newHead.x < 0 || newHead.x >= COLS || newHead.y < 0 || newHead.y >= ROWS) {
            gameOver = true;
            running = false;
            timer.stop();
            return;
        }

        // 撞到自己检测（尾巴即将移走的情况除外）
        if (snake.contains(newHead)) {
            gameOver = true;
            running = false;
            timer.stop();
            return;
        }

        snake.add(0, newHead);

        // 吃到食物
        if (newHead.equals(food)) {
            score += 10;
            spawnFood();
        } else {
            // 没吃到食物则移除尾巴，实现移动效果
            snake.remove(snake.size() - 1);
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // 绘制食物
        g2.setColor(new Color(231, 76, 60));
        g2.fillOval(food.x * CELL_SIZE, food.y * CELL_SIZE, CELL_SIZE, CELL_SIZE);

        // 绘制蛇
        for (int i = 0; i < snake.size(); i++) {
            Point p = snake.get(i);
            if (i == 0) {
                g2.setColor(new Color(46, 204, 113)); // 蛇头
            } else {
                g2.setColor(new Color(39, 174, 96)); // 蛇身
            }
            g2.fillRoundRect(p.x * CELL_SIZE, p.y * CELL_SIZE,
                    CELL_SIZE - 1, CELL_SIZE - 1, 8, 8);
        }

        // 绘制分数
        g2.setColor(Color.WHITE);
        g2.setFont(new Font("微软雅黑", Font.BOLD, 18));
        g2.drawString("得分: " + score, 10, 25);

        // 暂停提示
        if (!running && !gameOver) {
            drawCenteredText(g2, "已暂停", "按空格键继续");
        }

        // 游戏结束提示
        if (gameOver) {
            drawCenteredText(g2, "游戏结束", "得分 " + score + "  |  按空格键重新开始");
        }
    }

    private void drawCenteredText(Graphics2D g2, String title, String subtitle) {
        g2.setColor(new Color(0, 0, 0, 150));
        g2.fillRect(0, 0, WIDTH, HEIGHT);

        g2.setColor(Color.WHITE);
        g2.setFont(new Font("微软雅黑", Font.BOLD, 48));
        FontMetrics fm1 = g2.getFontMetrics();
        g2.drawString(title, (WIDTH - fm1.stringWidth(title)) / 2, HEIGHT / 2 - 20);

        g2.setFont(new Font("微软雅黑", Font.PLAIN, 22));
        FontMetrics fm2 = g2.getFontMetrics();
        g2.drawString(subtitle, (WIDTH - fm2.stringWidth(subtitle)) / 2, HEIGHT / 2 + 30);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("贪吃蛇 - Snake Game");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setResizable(false);
            frame.add(new snackgam());
            frame.pack();
            frame.setLocationRelativeTo(null); // 窗口居中
            frame.setVisible(true);
        });
    }
}
