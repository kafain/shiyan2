import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class MyFrame extends JFrame {
    private JLabel imageLabel;
    private JTextArea out;
    private JTextArea instruction;
    private JTextArea daima;

    public MyFrame() {
        setTitle("经典软件体系结构教学软件");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 800);
        setLocationRelativeTo(null);

        // 创建文本区域
        out = new JTextArea("运行结构\n");
        out.setEditable(false);

        instruction = new JTextArea("代码结构和文字说明\n");
        instruction.setEditable(false);

        imageLabel = new JLabel();

        daima = new JTextArea("关键代码\n");
        daima.setEditable(false);

        // 创建按钮
        JButton button1 = new JButton("主程序-子程序");
        JButton button2 = new JButton("面向对象体系");
        JButton button3 = new JButton("事件系统体系");
        JButton button4 = new JButton("管道过滤体系");

        // 为每个按钮添加点击事件监听器
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                restart();
                zhuzi.demo1.main(null);
                out.setText("主程序-子程序体系结构运行结果:");
                showFileContent("D:\\output.txt");
                instruction.setText("主程序-子程序体系结构是一种常见的软件编程风格，\n" +
                        "用于构建大型软件系统。\n" +
                        "这种风格将程序分成两种类型：主程序和子程序\n" +
                        "主程序负责控制程序流程和管理子程序的调用，\n" +
                        "而子程序负责执行具体的功能。\n"+
                        "// 主程序的代码结构\n" +
                        "public class MainProgram {\n" +
                        "    public static void main(String[] args) {\n" +
                        "        // 主程序的初始化操作\n" +
                        "        \n" +
                        "        // 调用子程序1\n" +
                        "        subProgram1();\n" +
                        "        \n" +
                        "        // 调用子程序2\n" +
                        "        subProgram2();\n" +
                        "        \n" +
                        "        // 主程序的其他逻辑操作\n" +
                        "    }\n" +
                        "    \n" +
                        "    // 子程序1的代码结构\n" +
                        "    public static void subProgram1() {\n" +
                        "        // 子程序1的功能实现\n" +
                        "    }\n" +
                        "    \n" +
                        "    // 子程序2的代码结构\n" +
                        "    public static void subProgram2() {\n" +
                        "        // 子程序2的功能实现\n" +
                        "    }\n" +
                        "}");
                daima.setText("public static void main(String[] args) {\n" +
                        "        demo1 kwic = new demo1();\n" +
                        "        kwic.input(\"D:\\\\input.txt\");\n" +
                        "        kwic.shift();\n" +
                        "        kwic.alphabetizer();\n" +
                        "        kwic.output(\"D:\\\\output.txt\");\n" +
                        "    }");

            }
        });

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                restart();
                duixiang.Main.main(null);
                out.setText("面向对象体系结构运行结果:");
                showFileContent("D:\\output.txt");
                instruction.setText("面向对象体系结构是一种软件设计的方法，\n" +
                        "它利用对象的概念来组织和构建应用程序的结构。\n" +
                        "面向对象体系结构的设计思想是将系统划分为多个相互协作的对象，\n" +
                        "每个对象都具有自己的属性和方法，\n" +
                        "并且可以通过消息传递来进行通信和交互。\n"+
                        "// 定义一个类\n" +
                        "class Car {\n" +
                        "    // 类的属性（成员变量）\n" +
                        "    private String model;\n" +
                        "    private String color;\n" +
                        "    private int price;\n" +
                        "    \n" +
                        "    // 类的构造函数\n" +
                        "    public Car(String model, String color, int price) {\n" +
                        "        this.model = model;\n" +
                        "        this.color = color;\n" +
                        "        this.price = price;\n" +
                        "    }\n" +
                        "    \n" +
                        "    // 类的方法（成员函数）\n" +
                        "    public String getModel() {\n" +
                        "        return model;\n" +
                        "    }\n" +
                        "\n" +
                        "    public void setModel(String model) {\n" +
                        "        this.model = model;\n" +
                        "    }\n" +
                        "\n" +
                        "    public String getColor() {\n" +
                        "        return color;\n" +
                        "    }\n" +
                        "\n" +
                        "    public void setColor(String color) {\n" +
                        "        this.color = color;\n" +
                        "    }\n" +
                        "\n" +
                        "    public int getPrice() {\n" +
                        "        return price;\n" +
                        "    }\n" +
                        "\n" +
                        "    public void setPrice(int price) {\n" +
                        "        this.price = price;\n" +
                        "    }\n" +
                        "    \n" +
                        "    public void drive() {\n" +
                        "        System.out.println(\"Driving \" + model + \" car.\");\n" +
                        "    }\n" +
                        "}\n" +
                        "\n" +
                        "// 主程序\n" +
                        "public class MainProgram {\n" +
                        "    public static void main(String[] args) {\n" +
                        "        // 创建对象\n" +
                        "        Car myCar = new Car(\"Tesla Model S\", \"Black\", 100000);\n" +
                        "        \n" +
                        "        // 访问对象的属性\n" +
                        "        System.out.println(myCar.getModel());   // 输出 \"Tesla Model S\"\n" +
                        "        System.out.println(myCar.getColor());   // 输出 \"Black\"\n" +
                        "        System.out.println(myCar.getPrice());   // 输出 100000\n" +
                        "        \n" +
                        "        // 修改对象的属性\n" +
                        "        myCar.setModel(\"Tesla Model X\");\n" +
                        "        myCar.setPrice(120000);\n" +
                        "        \n" +
                        "        // 调用对象的方法\n" +
                        "        myCar.drive();   // 输出 \"Driving Tesla Model X car.\"\n" +
                        "    }\n" +
                        "}");
                daima.setText("public static void main(String[] args) {\n" +
                        "        Input input = new Input();\n" +
                        "        input.input(\"D:\\\\input.txt\");\n" +
                        "        Shift shift = new Shift(input.getLineTxt());\n" +
                        "        shift.shift();\n" +
                        "        Alphabetizer alphabetizer = new Alphabetizer(shift.getKwicList());\n" +
                        "        alphabetizer.sort();\n" +
                        "        Output output = new Output(alphabetizer.getKwicList());\n" +
                        "        output.output(\"D:\\\\output.txt\");\n" +
                        "\n" +
                        "    }");
            }
        });

        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // restart();
                //shijian.Main.main(null);
                out.setText("事件系统体系结构运行结果:");
                showFileContent("D:\\output.txt");
                instruction.setText("事件系统体系结构是一种用于处理事件和消息的软件设计模式，\n" +
                        "事件系统可以帮助应用程序实现模块化、松耦合的设计，\n" +
                        "并提供一种有效的方式来处理和传递事件和消息。\n"+"" +
                        "// 事件类，用于描述事件的属性\n" +
                        "class Event {\n" +
                        "    private String name;\n" +
                        "    private Date time;\n" +
                        "    private Map<String, Object> data;\n" +
                        "    \n" +
                        "    public Event(String name) {\n" +
                        "        this.name = name;\n" +
                        "        time = new Date();\n" +
                        "        data = new HashMap<>();\n" +
                        "    }\n" +
                        "    \n" +
                        "    public String getName() {\n" +
                        "        return name;\n" +
                        "    }\n" +
                        "    \n" +
                        "    public Date getTime() {\n" +
                        "        return time;\n" +
                        "    }\n" +
                        "    \n" +
                        "    public void put(String key, Object value) {\n" +
                        "        data.put(key, value);\n" +
                        "    }\n" +
                        "    \n" +
                        "    public Object get(String key) {\n" +
                        "        return data.get(key);\n" +
                        "    }\n" +
                        "}\n" +
                        "\n" +
                        "// 事件监听器接口，用于处理事件\n" +
                        "interface EventListener {\n" +
                        "    void onEvent(Event event);\n" +
                        "}\n" +
                        "\n" +
                        "// 事件源类，用于产生事件\n" +
                        "class EventSource {\n" +
                        "    private List<EventListener> listeners = new ArrayList<>();\n" +
                        "    \n" +
                        "    public void addListener(EventListener listener) {\n" +
                        "        listeners.add(listener);\n" +
                        "    }\n" +
                        "    \n" +
                        "    public void removeListener(EventListener listener) {\n" +
                        "        listeners.remove(listener);\n" +
                        "    }\n" +
                        "    \n" +
                        "    public void fireEvent(Event event) {\n" +
                        "        for (EventListener listener : listeners) {\n" +
                        "            listener.onEvent(event);\n" +
                        "        }\n" +
                        "    }\n" +
                        "}\n" +
                        "\n" +
                        "// 定义一个事件监听器，处理特定类型的事件\n" +
                        "class MyEventListener implements EventListener {\n" +
                        "    @Override\n" +
                        "    public void onEvent(Event event) {\n" +
                        "        String name = event.getName();\n" +
                        "        if (name.equals(\"MY_EVENT\")) {\n" +
                        "            System.out.println(\"MyEventListener received MY_EVENT: \" + event.get(\"data\"));\n" +
                        "        }\n" +
                        "    }\n" +
                        "}\n" +
                        "\n" +
                        "// 主程序\n" +
                        "public class MainProgram {\n" +
                        "    public static void main(String[] args) {\n" +
                        "        // 创建事件源对象\n" +
                        "        EventSource eventSource = new EventSource();\n" +
                        "        \n" +
                        "        // 创建事件监听器对象\n" +
                        "        MyEventListener myListener = new MyEventListener();\n" +
                        "        \n" +
                        "        // 注册监听器\n" +
                        "        eventSource.addListener(myListener);\n" +
                        "        \n" +
                        "        // 发送事件\n" +
                        "        Event myEvent = new Event(\"MY_EVENT\");\n" +
                        "        myEvent.put(\"data\", \"Hello World!\");\n" +
                        "        eventSource.fireEvent(myEvent);\n" +
                        "    }\n" +
                        "}");
                daima.setText("public static void main(String[] args) {\n" +
                        "        //创建主题\n" +
                        "        KWICSubject kwicSubject = new KWICSubject();\n" +
                        "        //创建观察者\n" +
                        "        Input input = new Input(\"D:\\\\input.txt\");\n" +
                        "        Shift shift = new Shift(input.getLineTxt());\n" +
                        "        Alphabetizer alphabetizer = new Alphabetizer(shift.getKwicList());\n" +
                        "        Output output = new Output(alphabetizer.getKwicList(), \"D:\\\\output.txt\");\n" +
                        "\n" +
                        "        // 将观察者加入主题\n" +
                        "        kwicSubject.addObserver(input);\n" +
                        "        kwicSubject.addObserver(shift);\n" +
                        "        kwicSubject.addObserver(alphabetizer);\n" +
                        "        kwicSubject.addObserver(output);\n" +
                        "        // 逐步调用各个观察者\n" +
                        "        kwicSubject.startKWIC();\n" +
                        "    }");
            }
        });

        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                restart();
                try{
                    guandao.Main.main(null);
                }catch (IOException E){

                }

                out.setText("管道过滤体系结构运行结果:");
                showFileContent("D:\\output.txt");
                instruction.setText("管道过滤体系结构是一种软件设计模式，\n" +
                        "用于处理数据流经过多个处理步骤的情况。\n" +
                        "该体系结构将处理过程分解为多个独立的过滤器组件，\n" +
                        "每个过滤器负责对数据进行特定的处理。\n" +
                        "数据从一个过滤器传递到下一个过滤器，直到最终输出结果。\n"+
                        "// 定义过滤器接口\n" +
                        "interface Filter {\n" +
                        "    void process(Data data);\n" +
                        "}\n" +
                        "\n" +
                        "// 定义数据对象\n" +
                        "class Data {\n" +
                        "    private String value;\n" +
                        "    \n" +
                        "    public Data(String value) {\n" +
                        "        this.value = value;\n" +
                        "    }\n" +
                        "    \n" +
                        "    public String getValue() {\n" +
                        "        return value;\n" +
                        "    }\n" +
                        "    \n" +
                        "    public void setValue(String value) {\n" +
                        "        this.value = value;\n" +
                        "    }\n" +
                        "}\n" +
                        "\n" +
                        "// 实现具体过滤器\n" +
                        "class UpperCaseFilter implements Filter {\n" +
                        "    @Override\n" +
                        "    public void process(Data data) {\n" +
                        "        String value = data.getValue();\n" +
                        "        data.setValue(value.toUpperCase());\n" +
                        "    }\n" +
                        "}\n" +
                        "\n" +
                        "class ReverseFilter implements Filter {\n" +
                        "    @Override\n" +
                        "    public void process(Data data) {\n" +
                        "        String value = data.getValue();\n" +
                        "        StringBuilder sb = new StringBuilder(value);\n" +
                        "        data.setValue(sb.reverse().toString());\n" +
                        "    }\n" +
                        "}\n" +
                        "\n" +
                        "// 管道类\n" +
                        "class Pipeline {\n" +
                        "    private List<Filter> filters = new ArrayList<>();\n" +
                        "    \n" +
                        "    public void addFilter(Filter filter) {\n" +
                        "        filters.add(filter);\n" +
                        "    }\n" +
                        "    \n" +
                        "    public void process(Data data) {\n" +
                        "        for (Filter filter : filters) {\n" +
                        "            filter.process(data);\n" +
                        "        }\n" +
                        "    }\n" +
                        "}\n" +
                        "\n" +
                        "// 主程序\n" +
                        "public class MainProgram {\n" +
                        "    public static void main(String[] args) {\n" +
                        "        // 创建管道\n" +
                        "        Pipeline pipeline = new Pipeline();\n" +
                        "        \n" +
                        "        // 创建并添加过滤器到管道\n" +
                        "        pipeline.addFilter(new UpperCaseFilter());\n" +
                        "        pipeline.addFilter(new ReverseFilter());\n" +
                        "        \n" +
                        "        // 创建并初始化数据对象\n" +
                        "        Data data = new Data(\"Hello, world!\");\n" +
                        "        \n" +
                        "        // 处理数据\n" +
                        "        pipeline.process(data);\n" +
                        "        \n" +
                        "        // 输出结果\n" +
                        "        System.out.println(data.getValue());\n" +
                        "    }\n" +
                        "}");
                daima.setText("public static void main(String[] args) throws IOException {\n" +
                        "        File inFile = new File(\"D:\\\\input.txt\");\n" +
                        "        File outFile = new File(\"D:\\\\output.txt\");\n" +
                        "        Pipe pipe1 = new Pipe();\n" +
                        "        Pipe pipe2 = new Pipe();\n" +
                        "        Pipe pipe3 = new Pipe();\n" +
                        "        Input input = new Input(inFile, pipe1);\n" +
                        "        Shift shift = new Shift(pipe1, pipe2);\n" +
                        "        Alphabetizer alphabetizer  = new Alphabetizer(pipe2, pipe3);\n" +
                        "        Output output = new Output(outFile,pipe3);\n" +
                        "        input.transform();\n" +
                        "        shift.transform();\n" +
                        "        alphabetizer.transform();\n" +
                        "        output.transform();\n" +
                        "    }");
            }
        });

        // 创建面板
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        //创建按钮面板
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));

        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.add(button3);
        buttonPanel.add(button4);
        panel.add(buttonPanel,BorderLayout.NORTH);

        JPanel textAreaPanel = new JPanel();
        textAreaPanel.setLayout(new BoxLayout(textAreaPanel, BoxLayout.X_AXIS));
        // 将 imagePanel 添加到文本区域面板
        textAreaPanel.add(out);
        textAreaPanel.add(instruction);
        textAreaPanel.add(daima);
        panel.add(textAreaPanel, BorderLayout.CENTER);
        // 将面板添加到窗口中
        getContentPane().add(panel);
        // 显示窗口
        setVisible(true);
    }
    public static void restart() {
        File file = new File("D:\\output.txt");
        FileWriter filewriter;
        try {
            filewriter = new FileWriter(file);
            filewriter.write("");
            filewriter.flush();
            filewriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    private void showFileContent(String filename) {
        File file = new File(filename);
        StringBuilder result = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                result.append(line).append("\n");
            }
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
            result.append("文件读取出错！");
        }
        out.setText(result.toString());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MyFrame();
            }
        });
    }
}