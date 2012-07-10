PR = "r0"
require recipes/u-boot/u-boot.inc

SRC_URI = "ftp://ftp.denx.de/pub/u-boot/u-boot-2012.04.01.tar.bz2"
SRC_URI_append_usrp-e1xx ="\
        file://0002-OMAP3-overo-Set-default-mpurate-to-720-use-for-usrp-.patch \
        file://0003-u-boot-uEnv.patch \
        "

SRC_URI[md5sum] = "192bb231082d9159fb6e16de3039b6b2"
SRC_URI[sha256sum] = "db44041d39d9c31567babc3be85143b6acff45ff6f3693abf7e973bdc3dd95b0"

TARGET_LDFLAGS = ""

inherit base

do_compile () {
       oe_runmake ${UBOOT_MACHINE}
       oe_runmake all
}

pkg_postinst_u-boot () {
	if test "x$D" = "x" ; then
		install -m 755 /boot/${UBOOT_IMAGE} /media/FAT/u-boot.bin
	fi
}
