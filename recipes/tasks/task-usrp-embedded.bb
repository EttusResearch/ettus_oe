DESCRIPTION = "Base software to install on USRP Embedded"

PR = "r8"

inherit task

RDEPENDS_${PN} = "\
  cpufrequtils \
  ethtool \
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
"
