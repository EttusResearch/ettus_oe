require recipes/images/console-base-image.bb
require e100-image.inc

PR = "${INC_PR}.0"

DEPENDS += "task-base-extended \
	   "

IMAGE_INSTALL += " \
  task-base-extended \
  task-proper-tools \
  task-usrp-embedded \
  ${E100_UHD} \
  ${E100_GNURADIO} \
"

export IMAGE_BASENAME = "console-gnuradio-image"
