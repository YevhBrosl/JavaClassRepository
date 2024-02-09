package homework_18;

//Написать класс Собака.
//
//Каждая Собака обязательно должна иметь имя и высоту прыжка
//
//Должна уметь прыгать и должна уметь тренироваться.
//
//За каждую тренировку высота прыжка увеличивается максимум на 10 сантиметров
//
//Максимальная высота прыжка, которую может натренировать собака,
//не может быть больше, чем двукратная высота первоначального прыжка.
//
//Также должен быть метод взять барьер. В параметрах метод принимает высоту барьера.
//Если собака в состоянии преодолеть этот барьер - прыгает.
//Если не в состоянии, нужно проверить помогут ли тренировки
//        (будет ли данная собака в принципе в состоянии взять барьер).
//Если да -> идем тренироваться -> берет барьер

public class Dog {

    private String name;
    private int jumpHeight;

    public Dog(String name, int jumpHeight) {
        this.name = name;
        this.jumpHeight = jumpHeight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }

    public void setJumpHeight(int jumpHeight) {
        this.jumpHeight = jumpHeight;
    }

    public void jump() {
        System.out.println("Я прыгаю.");
    }

    public void exercise() {
        do {
            System.out.println("Я тренируюсь.");
            jumpHeight += 10;
        } while (jumpHeight <= jumpHeight * 2);

    }

    public void takeBarrier(int barrier) {
        if (barrier < jumpHeight) {
            jump();
            System.out.println("Я могу преодолеть барьер.");
        } else if (jumpHeight * 2 > barrier) {
             exercise();
            System.out.println("Барьер слишком высокий, мне надо тренироваться.");
        } else {
            System.out.println("Извини, барьер чересчур высокий, я не смогу его преодолеть.");
        }
        System.out.println("Я преодолеваю барьер.");
    }

}
