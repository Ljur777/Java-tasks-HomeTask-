public class EquationSolver { // ax^2+bx+c=0;



    public double linerEquation(double x, double a) {
        return a / x;
    }



    public double findDiscriminant(double a, double b, double c){  //принимаем ax^2+bx+c=0;
        return Math.pow(b, 2) - 4*a*c; //b*b - 4 * a * c;           //формула дискриминанта
    }

    public boolean isRoots(double discriminant){   //проверяем наличие дискриминанта
        if(discriminant< 0){                        //если дискриминант меньше 0 - корней нет
        return false;
        }
        else{                                       //если больше или равно 0 - корни будут
        return true;
        }
    }

    public boolean isTwoRoots(double discriminant){   //проверка на 2 кореня
        if(discriminant==0){                          //дискриминант равен 0- одиин корень
        return false;
        }
        else{
        return true;                                 //если дискриминант больше 0 - то будет 2 корень
        }
    }

        public double singleRoot(double a, double b, double discriminant){
          return (-b + Math.sqrt(discriminant))/2*a;                       //нахожу один корень
        }

        public double[] doubleRoot(double a, double b, double discriminant){
           double[] arr = new double[2];                                    //находим 2 корня
           arr[0] = singleRoot(a, b, discriminant);
           arr[1] = (-b - Math.sqrt(discriminant))/(2*a);
           return arr;
        }




}
