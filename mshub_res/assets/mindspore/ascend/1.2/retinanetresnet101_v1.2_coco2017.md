# retinanet_resnet101

---

model-name: retinanet_resnet101

backbone-name: retinanet_resnet101

module-type: cv

fine-tunable: True

input-shape: [227, 227, 3]

model-version: 1.2

train-dataset: coco2017

accuracy: 36

author: MindSpore team

update-time: 2021-09-14

repo-link: <https://gitee.com/mindspore/mindspore/tree/r1.2/model_zoo/research/cv/retinanet_resnet101>

user-id: MindSpore

used-for: inference

train-backend: ascend

infer-backend: ascend

mindspore-version: v1.2

asset:

-
    file-format: ckpt
    asset-link: <https://download.mindspore.cn/model_zoo/r1.2/retinanetresnet101_ascend_v120_coco2017_research_cv_bs32_acc36/retinanetresnet101_ascend_v120_coco2017_research_cv_bs32_acc36.ckpt>
    asset-sha256: ad9712e94c05c01a866d946e9beb297486be7b392c61e8db24d52a3e60134845

license: Apache2.0

summary: retinanet_resnet101 is used for cv

---

## Introduction

This MindSpore Hub model uses the implementation of retinanet_resnet101 from the MindSpore model zoo on Gitee at model_zoo/research/cv/retinanet_resnet101.

retinanet_resnet101 is a cv network. More details please refer to the MindSpore model zoo on Gitee at [model_zoo/research/cv/retinanet_resnet101](https://gitee.com/mindspore/mindspore/blob/r1.2/model_zoo/research/cv/retinanet_resnet101/README_CN.md).

All parameters in the module are trainable.

## Usage

```python
import mindspore
import mindspore_hub as mshub
from mindspore import Tensor
from mindspore import nn
from mindspore import context
from mindspore.train.model import Model
from mindspore.common import dtype as mstype
from mindspore.dataset.transforms import py_transforms

context.set_context(mode=context.GRAPH_MODE,
                    device_target="Ascend",
                    device_id=0)
# these parameter please refer the train file of the net.
feature_dim = 64
relation_dim = 32

model = "mindspore/ascend/1.2/retinanetresnet101_v1.2_coco2017"
# initialize the number of classes based on the pre-trained model
network = mshub.load(model, feature_dim=feature_dim, relation_dim=relation_dim)
network.set_train(False)

# ...
```

## Citation

1. Lin T Y , Goyal P , Girshick R , et al. Focal Loss for Dense Object Detection[C]// 2017 IEEE International Conference on Computer Vision (ICCV). IEEE, 2017:2999-3007.