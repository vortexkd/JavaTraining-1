package jp.co.goalist.array;

public class Question4 {
    
    public static void main(String[] args) {
        String[][] goalists = {
            {"���", "�Ï�", "����", "���", "�_�c", "���c1", "���c2"},
            {"���q", "����", "�є�", "�`�i�p"},
            {"�O��", "����", "���c"}
        };
        for (int i = 0; i < 3; i++) {
            int k = goalists[i].length;
            for (int j = 0; j < k; j++) {
                System.out.println(goalists[i][j]);
            }
        }
        
    }

}
