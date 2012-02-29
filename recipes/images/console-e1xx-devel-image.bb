require recipes/images/console-base-image.bb
require e100-image.inc

DISTRO_SSH_DAEMON = "openssh"

DEPENDS += "task-base-extended \
	   "
PR = "${INC_PR}.0"

IMAGE_INSTALL += " \
  task-base-extended \
  task-proper-tools \
  task-usrp-embedded \
  ${E100_UHD} \
  ${E100_TI_DSP} \
"


export IMAGE_BASENAME = "console-e1xx-devel-image"
