package Chapter6;

class ErrorMsg {
    String msgs[] = {
            "������ ������",
            "������ �����",
            "����������� ����� �� �����",
            "����� ������� �� ������� ���������"
    };

    String getErrorMsg(int i) {
        if ((i>=0) & (i< msgs.length))
                return msgs[i];
        else return "�������������� ��� ������";
    }
}

class ErrMsg {
    public static void main(String args[]) {
        ErrorMsg err = new ErrorMsg();

        System.out.println(err.getErrorMsg(2));
        System.out.println(err.getErrorMsg(19));
    }
}

