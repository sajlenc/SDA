package pl.sda.dp.decorator;

import java.util.ArrayList;
import java.util.List;

public class MyLogger {

    private Decorator decorator = null;
    private List<Decorator> decorators = new ArrayList<Decorator>();

    public MyLogger() {

    }

    public MyLogger(Decorator decorator) {
        this.decorator = decorator;
    }

    public MyLogger(List<Decorator> allDecorators) {
        this.decorators = allDecorators;
    }


    public MyLogger log(String message){

        if(decorator == null && decorators.isEmpty()) {

            System.out.println(message);

        }else if(!decorators.isEmpty()){

            List<String> strings = new ArrayList<String>();
            for(Decorator d: decorators){
                strings.add(d.toString());
            }
            System.out.println(String.join(", ", strings) + message);

        }else{

            System.out.println( decorator.prefix() + message);

        }

        return this;

    }

}

//null - tostring - null pointer exception
//valueof - check wheter null or not - more safe