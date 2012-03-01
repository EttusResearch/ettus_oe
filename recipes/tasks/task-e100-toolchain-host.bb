DESCRIPTION = "Host packages for E100 SDK"
LICENSE = "MIT"
ALLOW_EMPTY = "1"

inherit sdk

PACKAGES = "${PN}"

RDEPENDS_${PN} = " \
    pkgconfig-sdk \
    opkg-sdk \
    libtool-sdk \
"
