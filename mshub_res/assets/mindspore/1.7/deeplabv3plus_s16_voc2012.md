# deeplabv3plus

---

model-name: deeplabv3plus

backbone-name: deeplabv3plus

module-type: cv

fine-tunable: True

model-version: 1.7

train-dataset: voc2012

evaluation: s16acc78.7 | s16multiscale79.59 | s16multiscaleflip79.95

author: MindSpore team

update-time: 2022-06-22

repo-link: <https://gitee.com/mindspore/models/tree/r1.7/research/cv/deeplabv3plus>

user-id: MindSpore

used-for: inference

mindspore-version: 1.7

asset:

-
    file-format: ckpt
    asset-link: <https://download.mindspore.cn/models/r1.7/deeplabv3plus_s16_ascend_v170_voc2012_research_cv_s16acc78.7_s16multiscale79.59_s16multiscaleflip79.95.ckpt>
    asset-sha256: 41439dc8719331fdbc39ed7398a6745e560303d6a63f926fefc93be915264747

license: Apache2.0

summary: deeplabv3plus is used for cv

---

## Introduction

This MindSpore Hub model uses the implementation of deeplabv3plus from the MindSpore model zoo on Gitee at research/cv/deeplabv3plus.

deeplabv3plus is a cv network. More details please refer to the MindSpore model zoo on Gitee at [research/cv/deeplabv3plus](https://gitee.com/mindspore/models/blob/r1.7/research/cv/deeplabv3plus/README_CN.md).

All parameters in the module are trainable.

## Usage

```python
import mindspore_hub as mshub
from mindspore import context

context.set_context(mode=context.GRAPH_MODE,
                    device_target="Ascend",
                    device_id=0)

model = "mindspore/1.7/deeplabv3plus_s16_voc2012"
network = mshub.load(model)
network.set_train(False)

# ...
```

## Citation

Chen, Liang-Chieh, et al. "Encoder-decoder with atrous separable convolution for semantic image segmentation." Proceedings of the European conference on computer vision (ECCV). 2018.

## Disclaimer

MindSpore ("we") do not own any ownership or intellectual property rights of the datasets, and the trained models are provided on an "as is" and "as available" basis. We make no representations or warranties of any kind of the datasets and trained models (collectively, “materials”) and will not be liable for any loss, damage, expense or cost arising from the materials. Please ensure that you have permission to use the dataset under the appropriate license for the dataset and in accordance with the terms of the relevant license agreement. The trained models provided are only for research and education purposes.

To Dataset Owners: If you do not wish to have a dataset included in MindSpore, or wish to update it in any way, we will remove or update the content at your request. Please contact us through GitHub or Gitee. Your understanding and contributions to the community are greatly appreciated.

MindSpore is available under the Apache 2.0 license, please see the LICENSE file.
