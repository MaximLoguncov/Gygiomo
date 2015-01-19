package com.gygiom.gameobjects;

   import java.util.Random;

   public class Pipe extends Scrollable {

    private Random r;

    // ����� ���������� Pipe ������ � �������� ���������� �������� (Scrollable)
    public Pipe(float x, float y, int width, int height, float scrollSpeed) {
        super(x, y, width, height, scrollSpeed);
        // �������������� ������ ���� Random ��� ��������� ��������� �����
        r = new Random();
    }

    @Override
    public void reset(float newX) {
        // �������� reset ����� � ������������ ������ (Scrollable)
        super.reset(newX);
        // �������� ������ �� ��������� ��������
        height = r.nextInt(90) + 15;
    }

}