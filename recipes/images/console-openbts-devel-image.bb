require recipes/images/console-base-image.bb
require e100-image.inc

PR="${INC_PR}.r0"

DEPENDS += "task-base-extended \
	   "

IMAGE_INSTALL += " \
  task-base-extended \
  task-proper-tools \
  task-usrp-embedded \
  ${E100_UHD} \
  ${E100_OPENBTS} \
"

export IMAGE_BASENAME = "console-openbts-devel-image"
