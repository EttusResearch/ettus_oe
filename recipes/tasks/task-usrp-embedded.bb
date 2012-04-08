DESCRIPTION = "Base software to install on USRP Embedded"

PR = "r15"

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
  python-lxml \
  python-modules \
  gdb \
  vim-vimrc \
  sudo \
  sshfs-fuse \
  fuse \
  fuse-utils \
  openssh-sftp \
  openssh-sftp-server \
"
