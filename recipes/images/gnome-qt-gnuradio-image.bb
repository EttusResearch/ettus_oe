DESCRIPTION = "Image based on the GNOME desktop"

inherit image

PR = "r2"

XSERVER ?= "xserver-xorg \
           xf86-input-evdev \
           xf86-input-mouse \
           xf86-video-fbdev \
           xf86-video-sisusb \
           xf86-input-keyboard \
"
DISTRO_SSH_DAEMON = "openssh"

export IMAGE_BASENAME = "gnome-qt-gnuradio-image"

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
  task-usrp-embedded \
  qmake2 \
  qt4-tools \
  qt4-x11-free-dev \
  qt4-mkspecs \
  qwt \
  qwt-dev \
  qwt-examples \
  gnuradio \
  gnuradio-dev \
  gnuradio-grc \
  gnuradio-conf \
  gnuradio-examples \
  ti-dsplink \
  ti-dsplink-examples \
"

