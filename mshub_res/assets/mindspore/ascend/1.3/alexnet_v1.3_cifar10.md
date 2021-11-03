# alexnet

---

model-name: alexnet

backbone-name: alexnet

module-type: cv

fine-tunable: True

input-shape: [227, 227, 3]

model-version: 1.3

train-dataset: cifar10

accuracy: 89.38

author: MindSpore team

update-time: 2021-09-27

repo-link: <https://gitee.com/mindspore/mindspore/tree/r1.3/model_zoo/official/cv/alexnet>

user-id: MindSpore

used-for: inference

train-backend: ascend

infer-backend: ascend

mindspore-version: v1.3

asset:

-
    file-format: ckpt
    asset-link: <https://download.mindspore.cn/model_zoo/r1.3/alexnet_ascend_v130_cifar10_official_cv_bs32_acc89.38/alexnet_ascend_v130_cifar10_official_cv_bs32_acc89.38.ckpt>
    asset-sha256: 84569e4934f9a49093d50ba43f851a761fb35a8dad72c991ae928e0646a261c7

license: Apache2.0

summary: alexnet is used for cv

---

## Introduction

This MindSpore Hub model uses the implementation of alexnet from the MindSpore model zoo on Gitee at model_zoo/official/cv/alexnet.

alexnet is a cv network. More details please refer to the MindSpore model zoo on Gitee at [model_zoo/official/cv/alexnet](https://gitee.com/mindspore/mindspore/blob/r1.3/model_zoo/official/cv/alexnet/README.md).

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

model = "mindspore/ascend/1.3/alexnet_v1.3_cifar10"
# initialize the number of classes based on the pre-trained model
network = mshub.load(model)
network.set_train(False)

# ...
```

## Citation

1. Krizhevsky A, Sutskever I, Hinton G E. ImageNet Classification with Deep ConvolutionalNeural Networks. Advances In Neural Information Processing Systems.2012.
2. Krizhevsky A, Hinton G. Learning multiple layers of features from tiny images[J].2009.