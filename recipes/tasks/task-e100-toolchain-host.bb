#
# Copyright (C) 2007 OpenedHand Ltd
#

DESCRIPTION = "Host packages for the standalone SDK or external toolchain"
PR = "r0"
LICENSE = "MIT"
ALLOW_EMPTY = "1"

inherit sdk

PACKAGES = "${PN}"

RDEPENDS_${PN} = "\
    binutils-cross-sdk \
    gcc-cross-sdk \
    gdb-cross-sdk \
    pkgconfig-sdk \
    opkg-sdk \
    libtool-sdk \
    "
