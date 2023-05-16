package Statements;

public class Bus {
    int id;
    String Name;
    int startingTime;


    public static Bus[] filteredTimings(Bus[]arr){
        Bus filteredArr[] = new Bus[2];
        int x = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].startingTime>=6 && arr[i].startingTime<=9){
                filteredArr[x] = arr[i];
                x++;

            }
        }
        return filteredArr;
    }

    public static void main(String[]args){
        Bus[] arr = new Bus[3];
        Bus b1 = new Bus();
        b1.id = 1221;
        b1.Name = "asdf";
        b1.startingTime = 6;

        Bus b2 = new Bus();
        b2.id = 1222;
        b2.Name = "errgrf";
        b2.startingTime =5;

        Bus b3 = new Bus();
        b3.id = 1223;
        b3.Name = "sddsd";
        b3.startingTime = 8;

        arr[0] = b1;
        arr[1] = b2;
        arr[2] = b3;

        filteredTimings(arr);

        Bus[] filtered = filteredTimings(arr);
        for(Bus bus : filtered){
            System.out.println(bus.id +" "+ bus.Name +" "+ bus.startingTime);
        }

    }

}


