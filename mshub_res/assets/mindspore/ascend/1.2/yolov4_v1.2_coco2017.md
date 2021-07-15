# yolov4

---

model-name: yolov4

backbone-name: yolov4

module-type: cv

fine-tunable: True

input-shape: [227, 227, 3]

model-version: v1.2

train-dataset: coco2017

accuracy: 43

author: MindSpore team

update-time: 2021-06-29

repo-link: <https://gitee.com/mindspore/mindspore/tree/r1.2/model_zoo/official/cv/yolov4>

user-id: MindSpore

used-for: inference

train-backend: ascend

infer-backend: ascend

mindspore-version: v1.2

asset:

-
    file-format: ckpt
    asset-link: <https://download.mindspore.cn/model_zoo/r1.2/yolov4_ascend_v120_coco2017_official_cv_bs8_acc43/yolov4_ascend_v120_coco2017_official_cv_bs8_acc43.ckpt>
    asset-sha256: 98d4f85dbc758d6eac7789a579bb833d40c8e1983a8c97e45dec270581932b5e

license: Apache2.0

summary: yolov4 is used for cv

---

## Introduction

This MindSpore Hub model uses the implementation of yolov4 from the MindSpore model zoo on Gitee at model_zoo/official/cv/yolov4.

yolov4 is a cv network. More details please refer to the MindSpore model zoo on Gitee at [model_zoo/official/cv/yolov4](https://gitee.com/mindspore/mindspore/blob/r1.2/model_zoo/official/cv/yolov4/README.md).

All parameters in the module are trainable.

## Usage

```python
import mindspore_hub as mshub
from mindspore import context

context.set_context(mode=context.GRAPH_MODE,
                    device_target="Ascend",
                    device_id=0)

model = "mindspore/ascend/1.2/yolov4_v1.2_coco2017"
# initialize the number of classes based on the pre-trained model
network = mshub.load(model)
network.set_train(False)

# ...
```

## Citation

1. Bochkovskiy A, Wang C Y, Liao H Y M. YOLOv4: Optimal Speed and Accuracy of Object Detection[J]. arXiv preprint arXiv:2004.10934, 2020.