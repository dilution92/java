// Ż�� �������̽�
interface iVehicle2
{
    void vShow ();
}
// ���� �������̽�
interface iMaterial2
{
    void mShow();
}
// �ڵ��� Ŭ����
class Car2 implements iVehicle2, iMaterial2
{
    private int num;
    private double gas;
    
    public Car2(int n, double g)
    {
        num = n;
        gas = g;
        System.out.println("���� ��ȣ�� " + num + " �̸�, ���� ���� " + gas + " �� �ڵ����� ����������ϴ�.");
    }
    public void vShow()
    {
        System.out.println("���� ��ȣ�� " + num + " �Դϴ�.");
        System.out.println("���� ���� " + gas + " �Դϴ�.");
    }
    public void mShow()
    {
        System.out.println("�ڵ����� ������ ö�Դϴ�.");
    }
}
class Sample4
{
    public static void main(String[] args)
    {
      
    }
}
