package demo;

/**
 * @author wil
 * @description 逻辑题测试
 * @date 2019/8/2
 */
public class Demo1 {
    public static void main(String[] args){
        int arr[]  = new int[10];
        for(int a = 1 ; a<=4 ; a++){
            for(int b = 1 ; b<=4 ; b++){
                for(int c = 1 ; c<=4 ; c++){
                    for(int d = 1 ; d<=4 ; d++){
                        for(int e = 1 ; e<=4 ;e++){
                            for(int f = 1 ; f<=4 ; f++){
                                for(int g = 1 ; g<=4 ; g++){
                                    for(int h = 1 ; h<=4 ; h++){
                                        for(int i = 1 ; i<=4 ; i++){
                                            for(int j = 1 ; j<=4 ; j++){
                                                arr[0] = a;
                                                arr[1] = b;
                                                arr[2] = c;
                                                arr[3] = d;
                                                arr[4] = e;
                                                arr[5] = f;
                                                arr[6] = g;
                                                arr[7] = h;
                                                arr[8] = i;
                                                arr[9] = j;
                                                Utils.getArr(arr);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

