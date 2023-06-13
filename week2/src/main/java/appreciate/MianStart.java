package appreciate;

// 外观Mainframe类
 class Mainframe {
    private Memory memory;
    private CPU cpu;
    private HardDisk hardDisk;
    private OS os;

    public Mainframe() {
        this.memory = new Memory();
        this.cpu = new CPU();
        this.hardDisk = new HardDisk();
        this.os = new OS();
    }

    // 启动电脑的方法
    public void startUp() {
        if (memory.check() && cpu.run() && hardDisk.read() && os.load()) {
            System.out.println("电脑启动成功");
        } else {
            System.out.println("电脑启动失败");
        }
    }
}

// 子系统Memory类
 class Memory {
    public boolean check() {
        System.out.println("内存自检完成");
        return true;
    }
}

// 子系统cpu类
 class CPU {
    public boolean run() {
        System.out.println("CPU运行完成");
        return true;
    }
}

// 子系统HardDisk类
 class HardDisk {
    public boolean read() {
        System.out.println("硬盘读取完成");
        return true;
    }
}

// 子系统OS类
 class OS {
    public boolean load() {
        System.out.println("操作系统载入完成");
        return true;
    }
}

class MainStart {
    public static void main(String[] args) {
        Mainframe mainframe = new Mainframe();
        mainframe.startUp();
    }
}
