# Define some variables for e100 software groups. Avoiding tasks since
# users may want to uninstall without falling over tasks.
# task-usrp-embedded has all the stuff that I suspect users will not update
# from source

INC_PR = "r1"

E100_QT = "\
  qmake2 \
  qt4-tools \
  qt4-x11-free-dev \
  qt4-mkspecs \
  qwt \
  qwt-dev \
  qwt-examples \
"

E100_TI_DSP = "\
  ti-dsplink \
  ti-dsplink-examples \
  ti-lpm-module \
  ti-lpm-utils \
  ti-cmem-module \
"

E100_UHD ="\
  orc \
  orc-dev \
  uhd \
  uhd-dev \
  uhd-examples \
  uhd-tests \
"

E100_GNURADIO ="\
  gnuradio \
  gnuradio-grc \
  gnuradio-dev \
  gnuradio-examples \
"

E100_OPENBTS ="\
  libosip2-dev \
  ortp-dev \
  asterisk \
  sqlite3 \
  subversion \
"

