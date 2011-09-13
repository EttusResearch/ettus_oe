DESCRIPTION = "Universal Hardware Driver Firmware"
HOMEPAGE = "http://www.ettus.com"
LICENSE = "GPLv3"

# This recipe sucks. It exists only to create images when Josh won't create
# a tag.
# THE PV is basically wrong at this point. We use PR to make this package
# install instead of a firmware package built from a release.

PR = "r50"
PV = "003.002.003"

PACKAGE_ARCH = "all"

SRC_URI = "http://www.ettus.com/downloads/uhd_releases/master_images/UHD-images-${PV}-aecdce.tar.gz"

S = ${WORKDIR}/UHD-images-${PV}

do_install() {
	install -d ${D}${datadir}/uhd/images
	install -d ${D}${datadir}/uhd/images/bit
	install -m 0644 ${S}/share/uhd/images/bit/* ${D}${datadir}/uhd/images/bit
	rm -rf ${S}/share/uhd/images/bit
	install -m 0644 ${S}/share/uhd/images/* ${D}${datadir}/uhd/images
}

PACKAGES = "${PN}"
FILES_${PN} = ${datadir}/uhd/images

