DESCRIPTION = "Image based on the GNOME desktop"

inherit image

PR = "r0"

XSERVER ?= "xserver-xorg \
           xf86-input-evdev \
           xf86-input-mouse \
           xf86-video-fbdev \
           xf86-video-sisusb \
           xf86-input-keyboard \
"

export IMAGE_BASENAME = "gnome-e100-base-image"

#IMAGE_LINGUAS = "de-de fr-fr en-gb en-us pt-br es-es kn-in ml-in ta-in"
#ROOTFS_POSTPROCESS_COMMAND += 'install_linguas;'
IMAGE_PREPROCESS_COMMAND = "create_etc_timestamp"

IMAGE_LOGIN_MANAGER = "shadow"
IMAGE_SPLASH = "psplash-angstrom"

IMAGE_INSTALL += " \
  task-base-extended \
  ${IMAGE_SPLASH} \
  angstrom-task-gnome \
  setxkbmap \
  task-gnome-apps \
  task-proper-tools \
  qmake2 \
  qt4-tools \
  qt4-x11-free-dev \
  qt4-mkspecs \
  qwt \
  qwt-dev \
  qwt-examples \
  ti-dsplink \
  ti-dsplink-examples \
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
  vim-vimrc \
  sudo \
"

