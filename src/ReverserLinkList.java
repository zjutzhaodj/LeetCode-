import java.util.ArrayList;
import java.util.List;

/**
 * Created by Faker on 2018\4\20 0020.
 * email: 290707708@qq.com
 * blog: https://blog.csdn.net/qq_28709925
 *
 * 链表反向输出递归实现
 */
public class ReverserLinkList {

    public static void main(String args[]){
        Node node = new Node(1,new Node(2,new Node(3,new Node(4,null))));
        List<Integer> list =new ArrayList<>();
        reverseNodeList(node,list);
        System.out.println(list);
        System.out.println(reverseNodeList2(node));
    }

    public static void reverseNodeList(Node node,List<Integer> list){
        if(node.mNext == null){
            list.add(node.mData);
            return;
        }
        reverseNodeList(node.mNext,list);
        list.add(node.mData);
    }

    public static List<Integer> reverseNodeList2(Node node){
        if(node.mNext == null){
            List<Integer> sList = new ArrayList<>();
            sList.add(node.mData);
            return sList;
        }
        List<Integer> mlist = reverseNodeList2(node.mNext);
        mlist.add(node.mData);
        return mlist;
    }



    static class Node{
        public int mData;
        public Node mNext;

        public Node(int mData, Node mNext) {
            this.mData = mData;
            this.mNext = mNext;
        }
    }
}
