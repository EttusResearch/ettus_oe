require recipes/linux/linux.inc

DESCRIPTION = "Linux kernel for OMAP processors"
KERNEL_IMAGETYPE = "uImage"

COMPATIBLE_MACHINE = "usrp-e1xx"

FILESPATHPKG_prepend = "linux-usrp-embedded-3.0-pm:"

PV = "3.0-pm"
MACHINE_KERNEL_PR_append = "h"

SRCREV = "38fa80e38cf348dc599a9f01e5a2cd052e5af775"
SRC_URI = "git://www.sakoman.com/git/linux-omap-2.6.git;branch=omap-3.0-pm;protocol=git \
	file://0001-Add-defines-to-set-config-options-in-GPMC-per-CS-con.patch \
	file://0002-Add-functions-to-dma.c-to-set-address-and-length-for.patch \
	file://0003-Add-defconfig-to-save-working-kernel-.config.patch \
	file://0004-usrp_e-Add-driver-for-USRP-E1XX-FPGA-interface.patch \
	file://0005-usrp_e-Modify-overo-board-file-to-setup-hardware-for.patch \
	file://0001-mmc-Max-dto-to-14-for-testing.patch \
	file://0001-overo-Give-userspace-access-to-the-cycle-counter.patch \
	file://0001-usrp_e-Make-sure-user-space-does-not-pass-bad-offset.patch \
	file://0001-usrp_e-Change-bus-timing-for-command-interface.patch \
	file://0001-usrp_e-Extend-data-and-control-write-cycle-to-fix-S-.patch \
	file://defconfig \
	"

S = "${WORKDIR}/git"

pkg_postinst_kernel-image () {

if test "x$D" != "x"; then
	exit 1
elif test -d /media/FAT; then
	cp /${KERNEL_IMAGEDEST}/${KERNEL_IMAGETYPE}-${KERNEL_VERSION} /media/FAT/uImage
fi

}
