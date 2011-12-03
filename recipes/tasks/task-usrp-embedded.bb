DESCRIPTION = "Base software to install on USRP Embedded"

PR = "r10"

inherit task

RDEPENDS_${PN} = "\
  cpufrequtils \
  ethtool \
  i2c-tools \
  kernel-modules \
  oprofile \
  screen \
  htop \
  powertop \
  task-native-gnuradio-sdk \
  orc \
  python-lxml \
  python-subprocess \
  python-ctypes \
  gdb \
  uhd \
  uhd-dev \
  uhd-examples \
  uhd-tests \
  uhd-e1xx \
  vim-vimrc \
  sudo \
"
