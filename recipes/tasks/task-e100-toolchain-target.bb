DESCRIPTION = "Target packages for E100 SDK"
LICENSE = "MIT"
ALLOW_EMPTY = "1"

DEPENDS = "task-sdk-bare"

RDEPENDS_${PN} += " \
    task-sdk-bare \
    task-sdk-base \
    libusb1-dev \
    guile-dev \
    fftwf-dev \
    alsa-dev \
    alsa-lib-dev \
    jack-dev \
    cppunit-dev \
    python-dev \
    python-numpy-dev \
    boost-dev \
    gsl-dev \
"
