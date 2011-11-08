DESCRIPTION = "Universal Hardware Driver Firmware"
HOMEPAGE = "http://www.ettus.com"
LICENSE = "GPLv3"

DEFAULT_PREFERENCE = "-1"

# This recipe sucks. It exists only to create images when Josh won't create
# a tag.
# THE PV is basically wrong at this point. We use PR to make this package
# install instead of a firmware package built from a release.

PR = "r53"
PV = "003.003.000"

PACKAGE_ARCH = "all"

SRC_URI = "http://files.ettus.com/uhd_releases/master_images/UHD-images-003.003.000-1b57797.tar.gz"

S = ${WORKDIR}/UHD-images-003.003.000-1b57797

do_install() {
	install -d ${D}${datadir}/uhd/images
	install -d ${D}${datadir}/uhd/images/bit
	install -m 0644 ${S}/share/uhd/images/bit/* ${D}${datadir}/uhd/images/bit
	rm -rf ${S}/share/uhd/images/bit
	install -m 0644 ${S}/share/uhd/images/* ${D}${datadir}/uhd/images
}

PACKAGES = "${PN}"
FILES_${PN} = ${datadir}/uhd/images

SRC_URI[md5sum] = "4b0b885f1c44626813381c21d9e222c1"
SRC_URI[sha256sum] = "af3f382e57dabbf5ce5937635626248d50a5d4ed3f0881ac461f90cee8080aa3"

