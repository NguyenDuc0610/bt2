import java.util.ArrayList;
import java.util.List;

class QuanLyHoaDon {
    private final List<HoaDon> danhSachHoaDon;

    public QuanLyHoaDon() {
        danhSachHoaDon = new ArrayList<>();
    }

    public void themHoaDon(HoaDon hoaDon) {
        danhSachHoaDon.add(hoaDon);
    }

    public void xuatDanhSachHoaDon() {
        for (HoaDon hoaDon : danhSachHoaDon) {
            hoaDon.xuatThongTin();
        }
    }

    public int demSoLuongKhachHangVietNam() {
        int count = 0;
        for (HoaDon hoaDon : danhSachHoaDon) {
            if (hoaDon instanceof khachhangvietnam) count++;
        }
        return count;
    }

    public double tinhTrungBinhThanhTienKhachHangNuocNgoai() {
        double tongThanhTien = 0;
        int count = 0;
        for (HoaDon hoaDon : danhSachHoaDon) {
            if (hoaDon instanceof KhachHangNuocNgoai) {
                tongThanhTien += hoaDon.tinhThanhTien();
                count++;
            }
        }
        if (count == 0) {
            return 0;
        }
        return tongThanhTien / count;
    }

    public static void main(String[] args) {
        QuanLyHoaDon qlhd = new QuanLyHoaDon();

        khachhangvietnam khachHang1 = new khachhangvietnam("KH001", "Nguyễn Văn A", "01/05/2023", "sinh hoạt",
                100, 5000, 50);
        khachhangvietnam khachHang2 = new khachhangvietnam("KH002", "Trần Thị B", "02/05/2023", "kinh doanh",
                150, 6000, 80);
        KhachHangNuocNgoai khachHang3 = new KhachHangNuocNgoai("KH003", "John Smith", "03/05/2023", "USA",
                200, 7000);

        qlhd.themHoaDon(khachHang1);
        qlhd.themHoaDon(khachHang2);
        qlhd.themHoaDon(khachHang3);

        qlhd.xuatDanhSachHoaDon();

        int soLuongKhachHangVietNam = qlhd.demSoLuongKhachHangVietNam();
        System.out.println("Tổng số lượng khách hàng Việt Nam: " + soLuongKhachHangVietNam);

        double trungBinhThanhTienKhachHangNuocNgoai = qlhd.tinhTrungBinhThanhTienKhachHangNuocNgoai();
        System.out.println("Trung bình thành tiền khách hàng nước ngoài: " + trungBinhThanhTienKhachHangNuocNgoai);

        qlhd.xuatHoaDonThang5Nam2023();
    }

    private void xuatHoaDonThang5Nam2023() {
    }
}
