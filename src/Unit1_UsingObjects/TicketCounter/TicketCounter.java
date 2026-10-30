package Unit1_UsingObjects.TicketCounter;

/**
 * @author marilounanderson on 12/10/2026
 */
public class TicketCounter { //+1

    //instance variables +1
    private int tickets;
    private int batchSize;

    //Constructor
    public TicketCounter(int t, int b){ //+1
        //+1
        this.tickets = t;
        this.batchSize = b;
    }
    //+1
    public int currentTickets(){
        return tickets;
    }
    //+1
    public void addBatch(){
        //+1
        tickets += batchSize;
    }
    //+1
    public void sellBatch(){
        //+1
        if(tickets - batchSize >= 0){
            tickets -= batchSize;
        }
    }
}



class TextTC{
    static void main(){
        TicketCounter concert = new TicketCounter(10, 4);
        System.out.println(concert.currentTickets());
        concert.sellBatch();
        System.out.println(concert.currentTickets());
        concert.sellBatch();
        System.out.println(concert.currentTickets());
        concert.sellBatch();
        System.out.println(concert.currentTickets());
        concert.addBatch();
        System.out.println(concert.currentTickets());
    }
}

