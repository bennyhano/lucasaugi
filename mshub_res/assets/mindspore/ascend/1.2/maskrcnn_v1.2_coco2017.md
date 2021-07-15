# maskrcnn

---

model-name: maskrcnn

backbone-name: maskrcnn

module-type: cv

fine-tunable: True

input-shape: [227, 227, 3]

model-version: v1.2

train-dataset: coco2017

accuracy: 37

author: MindSpore team

update-time: 2021-06-29

repo-link: <https://gitee.com/mindspore/mindspore/tree/r1.2/model_zoo/official/cv/maskrcnn>

user-id: MindSpore

used-for: inference

train-backend: ascend

infer-backend: ascend

mindspore-version: v1.2

asset:

-
    file-format: ckpt
    asset-link: <https://download.mindspore.cn/model_zoo/r1.2/maskrcnn_ascend_v120_coco2017_official_cv_bs2_bboxacc37_segmacc32/maskrcnn_ascend_v120_coco2017_official_cv_bs2_bboxacc37_segmacc32.ckpt>
    asset-sha256: 631ca29f90fa2d806c559ceb790293bd3b614026e20b2d8acf7cfad2c25c07db

license: Apache2.0

summary: maskrcnn is used for cv

---

## Introduction

This MindSpore Hub model uses the implementation of maskrcnn from the MindSpore model zoo on Gitee at model_zoo/official/cv/maskrcnn.

maskrcnn is a cv network. More details please refer to the MindSpore model zoo on Gitee at [model_zoo/official/cv/maskrcnn](https://gitee.com/mindspore/mindspore/blob/r1.2/model_zoo/official/cv/maskrcnn/README.md).

All parameters in the module are trainable.

## Usage

```python
import mindspore_hub as mshub
from mindspore import context

context.set_context(mode=context.GRAPH_MODE,
                    device_target="Ascend",
                    device_id=0)

model = "mindspore/ascend/1.2/maskrcnn_v1.2_coco2017"
# initialize the number of classes based on the pre-trained model
network = mshub.load(model)
network.set_train(False)

# ...
```

## Citation

1. Kaiming He, Georgia Gkioxari, Piotr Dollar and Ross Girshick. "MaskRCNN"