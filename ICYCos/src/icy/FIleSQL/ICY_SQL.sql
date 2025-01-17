USE [ICY]
GO
/****** Object:  Table [dbo].[ChiTietHoaDon]    Script Date: 10/7/2022 10:07:50 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChiTietHoaDon](
	[MaHD] [nvarchar](max) NULL,
	[MaSP] [nvarchar](max) NULL,
	[TenSP] [nvarchar](max) NULL,
	[SoLuong] [nvarchar](max) NULL,
	[GiaBan] [nvarchar](max) NULL,
	[ThanhTien] [nvarchar](max) NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[ChiTietPhieuNhap]    Script Date: 10/7/2022 10:07:51 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChiTietPhieuNhap](
	[MaPN] [nvarchar](max) NULL,
	[MaSP] [nvarchar](max) NULL,
	[TenSP] [nvarchar](max) NULL,
	[SoLuong] [nvarchar](max) NULL,
	[DonGia] [nvarchar](max) NULL,
	[ThanhTien] [nvarchar](max) NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[CTKhuyenMai]    Script Date: 10/7/2022 10:07:51 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[CTKhuyenMai](
	[MACT] [nvarchar](50) NULL,
	[MAKM] [nvarchar](50) NULL,
	[MASP] [nvarchar](max) NULL,
	[GIAMGIA] [nvarchar](max) NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[HoaDon]    Script Date: 10/7/2022 10:07:51 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HoaDon](
	[MaHD] [nvarchar](max) NULL,
	[TenKH] [nvarchar](max) NULL,
	[TenNV] [nvarchar](max) NULL,
	[NgayLap] [nvarchar](max) NULL,
	[TongTien] [nvarchar](max) NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[KhachHang]    Script Date: 10/7/2022 10:07:51 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[KhachHang](
	[MAKH] [nvarchar](50) NULL,
	[HoLot] [nvarchar](50) NULL,
	[Ten] [nvarchar](50) NULL,
	[SoDienThoai] [nvarchar](50) NULL,
	[DiemTichLuy] [nvarchar](50) NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[KhuyenMai]    Script Date: 10/7/2022 10:07:51 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[KhuyenMai](
	[MAKM] [nvarchar](max) NULL,
	[TEN] [nvarchar](max) NULL,
	[NGAYBD] [nvarchar](max) NULL,
	[THANGBD] [nvarchar](max) NULL,
	[NAMBD] [nvarchar](max) NULL,
	[NGAYKT] [nvarchar](max) NULL,
	[THANGKT] [nvarchar](max) NULL,
	[NAMKT] [nvarchar](max) NULL,
	[TINHTRANG] [nvarchar](max) NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[LoaiSanPham]    Script Date: 10/7/2022 10:07:51 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[LoaiSanPham](
	[MaLoai] [nvarchar](max) NULL,
	[TenLoai] [nvarchar](max) NULL,
	[ThanhPhan] [nvarchar](max) NULL,
	[CongDung] [nvarchar](max) NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Luong]    Script Date: 10/7/2022 10:07:51 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Luong](
	[MaNV] [nvarchar](max) NULL,
	[LuongCB] [nvarchar](max) NULL,
	[PhuCapAnUong] [nvarchar](max) NULL,
	[PhuCapXangXe] [nvarchar](max) NULL,
	[PhuCapDienThoai] [nvarchar](max) NULL,
	[Thuong] [nvarchar](max) NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NguoiDung]    Script Date: 10/7/2022 10:07:51 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NguoiDung](
	[Ma] [nvarchar](max) NULL,
	[TaiKhoan] [nvarchar](max) NULL,
	[MatKhau] [nvarchar](max) NULL,
	[ChucVu] [nvarchar](max) NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NhaCungCap]    Script Date: 10/7/2022 10:07:51 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhaCungCap](
	[MaNCC] [nvarchar](max) NULL,
	[TenNCC] [nvarchar](max) NULL,
	[DiaChi] [nvarchar](max) NULL,
	[SDT] [nvarchar](max) NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NVIEN1]    Script Date: 10/7/2022 10:07:51 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NVIEN1](
	[Ma] [nvarchar](max) NULL,
	[Ho] [nvarchar](max) NULL,
	[Ten] [nvarchar](max) NULL,
	[GioiTinh] [nvarchar](max) NULL,
	[ChucVu] [nvarchar](max) NULL,
	[NgaySinh] [nvarchar](max) NULL,
	[ThangSinh] [nvarchar](max) NULL,
	[NamSinh] [nvarchar](max) NULL,
	[DiaChi] [nvarchar](max) NULL,
	[SDT] [nvarchar](max) NULL,
	[Email] [nvarchar](max) NULL,
	[Luong] [nvarchar](max) NULL,
	[Anh] [nvarchar](max) NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[PhieuNhap]    Script Date: 10/7/2022 10:07:51 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[PhieuNhap](
	[MaPN] [nvarchar](max) NULL,
	[MaNCC] [nvarchar](max) NULL,
	[MaNV] [nvarchar](max) NULL,
	[NgayLap] [nvarchar](max) NULL,
	[TongTien] [nvarchar](max) NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[SanPham]    Script Date: 10/7/2022 10:07:51 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[SanPham](
	[MaSP] [nvarchar](50) NULL,
	[TenSP] [nvarchar](50) NULL,
	[LoaiSP] [nvarchar](50) NULL,
	[GiaBan] [nvarchar](50) NULL,
	[SoLuong] [nvarchar](50) NULL,
	[DonViTinh] [nvarchar](50) NULL,
	[HinhAnh] [nvarchar](150) NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[ThamSoChung]    Script Date: 10/7/2022 10:07:51 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ThamSoChung](
	[TenKhoHang] [nvarchar](max) NULL,
	[TenPhieuNhap] [nvarchar](max) NULL,
	[ThongTinSanPham] [nvarchar](max) NULL,
	[ThongTinPhieuNhap] [nvarchar](max) NULL,
	[Ma] [nvarchar](max) NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
INSERT [dbo].[CTKhuyenMai] ([MACT], [MAKM], [MASP], [GIAMGIA]) VALUES (N'CT1', N'KM2', N'NRK', N'83')
INSERT [dbo].[CTKhuyenMai] ([MACT], [MAKM], [MASP], [GIAMGIA]) VALUES (N'CT2', N'KM2', N'EL', N'20')
INSERT [dbo].[CTKhuyenMai] ([MACT], [MAKM], [MASP], [GIAMGIA]) VALUES (N'CT3', N'KM2', N'PCL', N'80')
INSERT [dbo].[CTKhuyenMai] ([MACT], [MAKM], [MASP], [GIAMGIA]) VALUES (N'CT4', N'KM3', N'KR', N'40')
INSERT [dbo].[CTKhuyenMai] ([MACT], [MAKM], [MASP], [GIAMGIA]) VALUES (N'CT5', N'KM3', N'MGD', N'40')
INSERT [dbo].[CTKhuyenMai] ([MACT], [MAKM], [MASP], [GIAMGIA]) VALUES (N'CT6', N'KM4', N'COS', N'75')
INSERT [dbo].[CTKhuyenMai] ([MACT], [MAKM], [MASP], [GIAMGIA]) VALUES (N'CT7', N'KM1', N'COS', N'75')
INSERT [dbo].[CTKhuyenMai] ([MACT], [MAKM], [MASP], [GIAMGIA]) VALUES (N'CT8', N'KM4', N'TM', N'75')
GO
INSERT [dbo].[KhachHang] ([MAKH], [HoLot], [Ten], [SoDienThoai], [DiemTichLuy]) VALUES (N'KH1', N'Trần Thị Hạ', N'Long', N'0124567888', '0')
INSERT [dbo].[KhachHang] ([MAKH], [HoLot], [Ten], [SoDienThoai], [DiemTichLuy]) VALUES (N'KH2', N'Đặng Thị Mỹ', N'Ly', N'0123456789', '0')
INSERT [dbo].[KhachHang] ([MAKH], [HoLot], [Ten], [SoDienThoai], [DiemTichLuy]) VALUES (N'KH3', N'Trần', N'Long', N'0914725836', '0')
INSERT [dbo].[KhachHang] ([MAKH], [HoLot], [Ten], [SoDienThoai], [DiemTichLuy]) VALUES (N'KH4', N'Nguyễn Thu', N'Hà', N'0245789361', '0')
INSERT [dbo].[KhachHang] ([MAKH], [HoLot], [Ten], [SoDienThoai], [DiemTichLuy]) VALUES (N'KH5', N'Phan Văn', N'Hoàn', N'0234567192', '0')
INSERT [dbo].[KhachHang] ([MAKH], [HoLot], [Ten], [SoDienThoai], [DiemTichLuy]) VALUES (N'KH6', N'Nguyễn Văn', N'Xoài', N'0245678931', '0')
INSERT [dbo].[KhachHang] ([MAKH], [HoLot], [Ten], [SoDienThoai], [DiemTichLuy]) VALUES (N'KH7', N'Nguyễn Thị', N'Cóc', N'0111223344', '0')
INSERT [dbo].[KhachHang] ([MAKH], [HoLot], [Ten], [SoDienThoai], [DiemTichLuy]) VALUES (N'KH8', N'Nguyễn Quang', N'Ổi', N'0023456789', '0')
INSERT [dbo].[KhachHang] ([MAKH], [HoLot], [Ten], [SoDienThoai], [DiemTichLuy]) VALUES (N'KH9', N'Tạ Quang', N'Bửu', N'0123456123', '0')
INSERT [dbo].[KhachHang] ([MAKH], [HoLot], [Ten], [SoDienThoai], [DiemTichLuy]) VALUES (N'KH10', N'Nguyễn Văn', N'A', N'0213456789', '0')
INSERT [dbo].[KhachHang] ([MAKH], [HoLot], [Ten], [SoDienThoai], [DiemTichLuy]) VALUES (N'KH11', N'Nguyễn Thị', N'B', N'0456789123', '0')
INSERT [dbo].[KhachHang] ([MAKH], [HoLot], [Ten], [SoDienThoai], [DiemTichLuy]) VALUES (N'KH12', N'Hồ Quang', N'Đạt', N'0123456787', '0')
INSERT [dbo].[KhachHang] ([MAKH], [HoLot], [Ten], [SoDienThoai], [DiemTichLuy]) VALUES (N'KH13', N'Nguyễn Yến', N'Nhi', N'0145678912', '0')
INSERT [dbo].[KhachHang] ([MAKH], [HoLot], [Ten], [SoDienThoai], [DiemTichLuy]) VALUES (N'KH14', N'Phan Diễm', N'Quỳnh', N'0234567144', '0')
INSERT [dbo].[KhachHang] ([MAKH], [HoLot], [Ten], [SoDienThoai], [DiemTichLuy]) VALUES (N'KH15', N'Hồ Quỳnh', N'Hương', N'0231456741', '0')
INSERT [dbo].[KhachHang] ([MAKH], [HoLot], [Ten], [SoDienThoai], [DiemTichLuy]) VALUES (N'KH16', N'Mai Hồng', N'Ngọc', N'0741256894', '0')
INSERT [dbo].[KhachHang] ([MAKH], [HoLot], [Ten], [SoDienThoai], [DiemTichLuy]) VALUES (N'KH17', N'Nguyễn Thị', N'Mận', N'0456789417', '0')
INSERT [dbo].[KhachHang] ([MAKH], [HoLot], [Ten], [SoDienThoai], [DiemTichLuy]) VALUES (N'KH18', N'Nguyễn Ngọc', N'Sáng', N'04123567894', '0')
INSERT [dbo].[KhachHang] ([MAKH], [HoLot], [Ten], [SoDienThoai], [DiemTichLuy]) VALUES (N'KH19', N'Nguyễn Ngọc', N'Giàu', N'0987456123', '0')
INSERT [dbo].[KhachHang] ([MAKH], [HoLot], [Ten], [SoDienThoai], [DiemTichLuy]) VALUES (N'KH20', N'Hồ văn', N'Sáng', N'0714235689', '0')
GO
INSERT [dbo].[KhuyenMai] ([MAKM], [TEN], [NGAYBD], [THANGBD], [NAMBD], [NGAYKT], [THANGKT], [NAMKT]) VALUES (N'KM1', N'HAPPY WOMENS DAY 03.03', N'03', N'03', N'2022', N'13', N'03', N'2022', N'Kết thúc')
INSERT [dbo].[KhuyenMai] ([MAKM], [TEN], [NGAYBD], [THANGBD], [NAMBD], [NGAYKT], [THANGKT], [NAMKT]) VALUES (N'KM2', N'ƯU ĐÃI 40% MỸ PHẨM', N'08', N'05', N'2022', N'09', N'05', N'2022', N'Kết thúc')
INSERT [dbo].[KhuyenMai] ([MAKM], [TEN], [NGAYBD], [THANGBD], [NAMBD], [NGAYKT], [THANGKT], [NAMKT]) VALUES (N'KM3', N'MỪNG XUÂN 2023', N'01', N'01', N'2023', N'15', N'02', N'2023', N'Kết thúc')
INSERT [dbo].[KhuyenMai] ([MAKM], [TEN], [NGAYBD], [THANGBD], [NAMBD], [NGAYKT], [THANGKT], [NAMKT]) VALUES (N'KM4', N'CHÀO HÈ NĂNG ĐỘNG', N'07', N'07', N'2023', N'14', N'07', N'2023', N'Đang diễn ra')
GO
INSERT [dbo].[LoaiSanPham] ([MaLoai], [TenLoai], [ThanhPhan], [CongDung]) VALUES (N'CSD', N'Chăm sóc da', N'Ceramides, Dimethicone, Retinoids, Kojic Acid, Hyaluronic Acid, Salicylic Acid, Vitamin C, Benzoyl Peroxide.', N'Không chỉ đơn thuần giữ vai trò làm đẹp mà còn giúp làn da sinh màng bảo vệ chống lại quá trình ô xy hóa sản sinh mụn, tăng sức đề kháng cho làn da trước các tác động môi trường, hỗ trợ quá trình chống ô xy hóa')
INSERT [dbo].[LoaiSanPham] ([MaLoai], [TenLoai], [ThanhPhan], [CongDung]) VALUES (N'MPCN', N'Mỹ phẩm chức năng', N'Hyaluronic Acid (HA), Vitamin A (Retinol), Vitamin B (Niacinamide), Vitamin C, Salicylic Acid (BHA), Glycolic Acid, Lactic Acid (AHA), Coenzyme Q10, Matrixyl 3000.', N'Ngoài có chức năng nuôi dưỡng, chăm sóc da như mĩ phẩm bình thường thì mĩ phẩm chức năng còn giúpđiều trị; hỗ trợ điều trị các bệnh lý về da: vẩy nến, chàm, mụn, nám. Xử lý các vấn đề như mụn, viêm da cơ địa, nám, lão hoá , chàm,  di ứng vô cùng hiệu quả.')
INSERT [dbo].[LoaiSanPham] ([MaLoai], [TenLoai], [ThanhPhan], [CongDung]) VALUES (N'CN', N'Chống nắng', N'Tinosorb S và M, Mexoryl SX, Oxybenzone, Avobenzone, Titanium dioxide, Kẽm oxit, PABA và propamine salicylate PABA', N'Giúp bạn ngăn ngừa sạm nám và quá trình lão hóa da sớm, duy trì độ ẩm cho da, và nhất là giảm nguy cơ ung thư da')
INSERT [dbo].[LoaiSanPham] ([MaLoai], [TenLoai], [ThanhPhan], [CongDung]) VALUES (N'LSD', N'Làm sạch da', N'ALOE VERA, ARGAN OIL, BETA-HYDROXY ACID (BHA), CAFFEINE, COENZYME Q10 (COQ10) ,EMOLLIENT.', N'Giúp loại bỏ đi bụi bẩn, vi khuẩn, làm sạch sâu cho da, tạo sự thoáng mát, nhẹ nhàng cho da, tránh được các tình trạng gây bí lỗ chân lông, ngăn ngừa các bệnh về da liễu như tàn nhang, nổi mẩn đó, dị ứng, kích ứng da và tránh sự lão hóa da.')
INSERT [dbo].[LoaiSanPham] ([MaLoai], [TenLoai], [ThanhPhan], [CongDung]) VALUES (N'TD', N'Trang điểm', N'Chất nền, chất nhũ hoa, chất làm đặc, hoạt chất, chất làm mềm, chất tạo màu, chất bảo quản, các chất làm mờ và làm sáng, mùi hương.', N'Giúp phái đẹp khắc phục được nhược điểm, tự tin khi đối diện với những người xung quanh. Giúp điều chỉnh vóc hình khuôn mặt mà bạn yêu thích nhất tự tin nhất.')
GO
INSERT [dbo].[Luong] ([MaNV], [LuongCB], [PhuCapAnUong], [PhuCapXangXe], [PhuCapDienThoai], [Thuong]) VALUES (N'GD00', N'10000000', N'730000', N'200000', N'200000', N'2000000')
INSERT [dbo].[Luong] ([MaNV], [LuongCB], [PhuCapAnUong], [PhuCapXangXe], [PhuCapDienThoai], [Thuong]) VALUES (N'GD01', N'10000000', N'730000', N'200000', N'200000', N'2000000')
INSERT [dbo].[Luong] ([MaNV], [LuongCB], [PhuCapAnUong], [PhuCapXangXe], [PhuCapDienThoai], [Thuong]) VALUES (N'GD02', N'10000000', N'730000', N'200000', N'200000', N'2000000')
INSERT [dbo].[Luong] ([MaNV], [LuongCB], [PhuCapAnUong], [PhuCapXangXe], [PhuCapDienThoai], [Thuong]) VALUES (N'QLNV', N'7000000', N'730000', N'200000', N'200000', N'2000000')
INSERT [dbo].[Luong] ([MaNV], [LuongCB], [PhuCapAnUong], [PhuCapXangXe], [PhuCapDienThoai], [Thuong]) VALUES (N'QLSP', N'7000000', N'730000', N'200000', N'200000', N'2000000')
INSERT [dbo].[Luong] ([MaNV], [LuongCB], [PhuCapAnUong], [PhuCapXangXe], [PhuCapDienThoai], [Thuong]) VALUES (N'QLHD', N'70000000', N'730000', N'200000', N'200000', N'2000000')
INSERT [dbo].[Luong] ([MaNV], [LuongCB], [PhuCapAnUong], [PhuCapXangXe], [PhuCapDienThoai], [Thuong]) VALUES (N'GD03', N'10000000', N'730000', N'200000', N'200000', N'2000000')
GO
INSERT INTO NguoiDung
values(N'GD00',N'giamdoc',N'111',N'Giám đốc')
INSERT INTO NguoiDung
values(N'QLNV',N'nhanvien',N'123',N'Quản lý nhân viên')
INSERT INTO NguoiDung
values(N'QLDH',N'donhang',N'123',N'Quản lý đơn hàng')
INSERT INTO NguoiDung
values(N'QLKH',N'khachhang',N'123',N'Quản lý khách hàng')
INSERT INTO NguoiDung
values(N'QLSP',N'quanlysanpham',N'123',N'Quản lý sản phẩm')
INSERT INTO NguoiDung
values(N'QLNH',N'nhaphang',N'123',N'Quản lý nhập hàng')
INSERT INTO NguoiDung
values(N'QLKM',N'khuyenmai',N'123',N'Quản lý khuyễn mãi')

INSERT INTO NVIEN1
values( N'GD00',N'Đặng Thị Mỹ',N'Ly',N'Nữ',N'Giám đốc',N'10',N'02',N'1989',N'Huế',
N'347876987',N'myylyy@gmail.com',N'70000000', 
N'E:\XayDungPhanMemTheoMoHinhPhanLop\HinhAnh_ICY\AnhNV\GD00.PNG')
INSERT INTO NVIEN1
values( N'BV01',N'Phùng Hoàng',N'Lâm',N'Nam',N'	Quản lý khách hàng',N'06',N'02'
,N'19999',N'TP.HCM',N'6577823450',N'hoanglam@gmail.com',N'5000000', N'E:\XayDungPhanMemTheoMoHinhPhanLop\HinhAnh_ICY\AnhNV\BV01.PNG')
INSERT INTO NVIEN1
values( N'QLNV',N'Hoàng Khánh ',N'Linh',N'Nữ',N'Quản lý nhân viên',N'10'
,N'02',N'1989',N'Huế',N'347876987',N'khanhlinh@gmail.com',N'70000000', 
N'E:\XayDungPhanMemTheoMoHinhPhanLop\HinhAnh_ICY\AnhNV\them2.PNG')
INSERT INTO NVIEN1
values( N'QLSP',N'Nguyễn Khánh ',N'Huy',N'Nam',N'Quản lý sản phẩm',N'16',N'01'
,N'1995',N'TP.HCM',N'6577823450',N'khanhhuy@gmail.com',N'5000000', 
N'E:\XayDungPhanMemTheoMoHinhPhanLop\HinhAnh_ICY\AnhNV\them10.PNG')
INSERT INTO NVIEN1
values( N'QLDH',N'Văn Viết ',N'Nam',N'Nam',N'Quản lý đơn hàng',N'21',N'12',N'1993',N'TP.HCM',
N'0098753621',N'vietnam@gmail.com',N'5000000', N'E:\XayDungPhanMemTheoMoHinhPhanLop\HinhAnh_ICY\AnhNV\them8.PNG')
INSERT INTO NVIEN1
values( N'QLKM',N'Tôn Nữ Thùy',N'Nhiên',N'Nữ',N'Quản lý khuyến mãi',N'11',N'04',N'1999',N'Huế',N'347876987'
,N'thuynhien@gmail.com',N'70000000', N'E:\XayDungPhanMemTheoMoHinhPhanLop\HinhAnh_ICY\AnhNV\them4.PNG')
INSERT INTO NVIEN1
values( N'SHP',N'Nguyễn Nhật',N'Nam',N'Nam',N'Quản lý nhập hàng',N'11'
,N'02',N'2000',N'TP.HCM',N'6577823450',N'nhatnam@gmail.com',
N'5000000', N'E:\XayDungPhanMemTheoMoHinhPhanLop\HinhAnh_ICY\AnhNV\them1.PNG')

INSERT [dbo].[SanPham] ([MaSP], [TenSP], [LoaiSP], [GiaBan], [SoLuong], [DonViTinh], [HinhAnh]) VALUES (N'NRK', N'Mặt nạ Naruko', N'Chăm sóc da', N'30000', N'5', N'25 ml', N'E:\XayDungPhanMemTheoMoHinhPhanLop\HinhAnh_ICY\SanPham\MatNa_NRK.jpg')
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [LoaiSP], [GiaBan], [SoLuong], [DonViTinh], [HinhAnh]) VALUES (N'EL', N'Xịt khoáng Evoluderm', N'Chăm sóc da', N'259000', N'2', N'400 ml', N'E:\XayDungPhanMemTheoMoHinhPhanLop\HinhAnh_ICY\SanPham\XitKhoang_EL.jpg')
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [LoaiSP], [GiaBan], [SoLuong], [DonViTinh], [HinhAnh]) VALUES (N'SP', N'Sữa dưỡng da Simple', N'Chăm sóc da', N'168000', N'3', N'125 ml', N'E:\XayDungPhanMemTheoMoHinhPhanLop\HinhAnh_ICY\SanPham\SuaDuongDa_SP.jpg')
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [LoaiSP], [GiaBan], [SoLuong], [DonViTinh], [HinhAnh]) VALUES (N'PCL', N'Kem dưỡng da Peacholic', N'Chăm sóc da', N'450000', N'2', N'100 ml', N'E:\XayDungPhanMemTheoMoHinhPhanLop\HinhAnh_ICY\SanPham\KemDuongDa_PCL.jpg')
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [LoaiSP], [GiaBan], [SoLuong], [DonViTinh], [HinhAnh]) VALUES (N'KR', N'Kem dưỡng ẩm Klairs', N'Chăm sóc da', N'360000', N'5', N'60 ml', N'E:\XayDungPhanMemTheoMoHinhPhanLop\HinhAnh_ICY\SanPham\KemDuongAm_KR.jpg')
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [LoaiSP], [GiaBan], [SoLuong], [DonViTinh], [HinhAnh]) VALUES (N'MGD', N'Gel trị mụn Megadou', N'Mỹ phẩm chức năng', N'106000', N'3', N'19 gam', N'E:\XayDungPhanMemTheoMoHinhPhanLop\HinhAnh_ICY\SanPham\GelTriMun_MGD.jpg')
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [LoaiSP], [GiaBan], [SoLuong], [DonViTinh], [HinhAnh]) VALUES (N'OB', N'Nước cân bằng da OBagi', N'Mỹ phẩm chức năng', N'8800000', N'6', N'48 ml', N'E:\XayDungPhanMemTheoMoHinhPhanLop\HinhAnh_ICY\SanPham\NuocCanBangDa_OB.jpg')
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [LoaiSP], [GiaBan], [SoLuong], [DonViTinh], [HinhAnh]) VALUES (N'RP', N'Gel rửa mặt Roche-Posay', N'Mỹ phẩm chức năng', N'175000', N'2', N'50 ml', N'E:\XayDungPhanMemTheoMoHinhPhanLop\HinhAnh_ICY\SanPham\GelRuaMat_RP.jpg')
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [LoaiSP], [GiaBan], [SoLuong], [DonViTinh], [HinhAnh]) VALUES (N'DE', N'gel ngừa mụn Decumar', N'Mỹ phẩm chức năng', N'77000', N'3', N'20 gam', N'E:\XayDungPhanMemTheoMoHinhPhanLop\HinhAnh_ICY\SanPham\GelNguaMun_De.jpg')
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [LoaiSP], [GiaBan], [SoLuong], [DonViTinh], [HinhAnh]) VALUES (N'COS', N'Miếng dán mụn Cosrx', N'Mỹ phẩm chức năng', N'7000', N'20', N'1 cái', N'E:\XayDungPhanMemTheoMoHinhPhanLop\HinhAnh_ICY\SanPham\MiengDanMun_Cos.jpg')
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [LoaiSP], [GiaBan], [SoLuong], [DonViTinh], [HinhAnh]) VALUES (N'TPL', N'Kem chống nắng Peacholic', N'Chống nắng', N'760000', N'2', N'60 ml', N'E:\XayDungPhanMemTheoMoHinhPhanLop\HinhAnh_ICY\SanPham\KemChongNang_TPL.jpg')
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [LoaiSP], [GiaBan], [SoLuong], [DonViTinh], [HinhAnh]) VALUES (N'SL', N'Sữa chống nắng Sunplay', N'Chống nắng', N'182000', N'3', N'55 gam', N'E:\XayDungPhanMemTheoMoHinhPhanLop\HinhAnh_ICY\SanPham\SuaChongNang_SL.jpg')
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [LoaiSP], [GiaBan], [SoLuong], [DonViTinh], [HinhAnh]) VALUES (N'FD', N'Gel chống nắng Fixderma', N'Chống nắng', N'243000', N'5', N'75 gam', N'E:\XayDungPhanMemTheoMoHinhPhanLop\HinhAnh_ICY\SanPham\GelChongNang_FD.jpg')
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [LoaiSP], [GiaBan], [SoLuong], [DonViTinh], [HinhAnh]) VALUES (N'TO', N'Tẩy tế bào chết The Ordinary', N'Làm sạch da', N'285000', N'2', N'30 ml', N'E:\XayDungPhanMemTheoMoHinhPhanLop\HinhAnh_ICY\SanPham\TayTeBaoChet_TO.jpg')
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [LoaiSP], [GiaBan], [SoLuong], [DonViTinh], [HinhAnh]) VALUES (N'CE', N'Sữa rửa mặt Cetaphil', N'Làm sạch da', N'271000', N'5', N'500 ml', N'E:\XayDungPhanMemTheoMoHinhPhanLop\HinhAnh_ICY\SanPham\SuaRuaMat_CE.jpg')
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [LoaiSP], [GiaBan], [SoLuong], [DonViTinh], [HinhAnh]) VALUES (N'DP', N'Dầu tẩy trang Peacholic', N'Làm sạch da', N'160000', N'2', N'50 ml', N'E:\XayDungPhanMemTheoMoHinhPhanLop\HinhAnh_ICY\SanPham\DauTayTrang_DP.jpg')
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [LoaiSP], [GiaBan], [SoLuong], [DonViTinh], [HinhAnh]) VALUES (N'TM', N'Gel kẻ mắt Tony Moly', N'Trang điểm', N'130000', N'2', N'4 gam', N'E:\XayDungPhanMemTheoMoHinhPhanLop\HinhAnh_ICY\SanPham\SonLi_3C.jpg')
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [LoaiSP], [GiaBan], [SoLuong], [DonViTinh], [HinhAnh]) VALUES (N'MTF', N'Chì kẻ mắt Merzy', N'Trang điểm', N'134000', N'1', N'0.5 gam', N'E:\XayDungPhanMemTheoMoHinhPhanLop\HinhAnh_ICY\SanPham\ChiKeMat_MTF.jpg')
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [LoaiSP], [GiaBan], [SoLuong], [DonViTinh], [HinhAnh]) VALUES (N'3C', N'Son lì 3CE', N'Trang điểm', N'347000', N'6', N'3.5 gam', N'E:\XayDungPhanMemTheoMoHinhPhanLop\HinhAnh_ICY\SanPham\SonLi_3C.jpg')
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [LoaiSP], [GiaBan], [SoLuong], [DonViTinh], [HinhAnh]) VALUES (N'EH', N'Phấn mắt Etude Hause', N'Trang điểm', N'300000', N'2', N'1 cái', N'E:\XayDungPhanMemTheoMoHinhPhanLop\HinhAnh_ICY\SanPham\PhanMat_EH.jpg')
GO
INSERT [dbo].[ThamSoChung] ([TenKhoHang], [TenPhieuNhap], [ThongTinSanPham], [ThongTinPhieuNhap], [Ma]) VALUES (N'Kho hàng', N'Tên phiếu nhập', N'Thông tin sản phẩm', N'Thông tin phiếu nhập', N'1')
GO
