# FaceRecognition

---

model-name: FaceRecognition

backbone-name: FaceRecognition

module-type: cv

fine-tunable: True

model-version: 1.7

train-dataset: ms1mv2

evaluation: acc90

author: MindSpore team

update-time: 2022-06-22

repo-link: <https://gitee.com/mindspore/models/tree/r1.7/research/cv/FaceRecognition>

user-id: MindSpore

used-for: inference

mindspore-version: 1.7

asset:

-
    file-format: ckpt
    asset-link: <https://download.mindspore.cn/models/r1.7/facerecognition_ascend_v170_ms1mv2_research_cv_acc90.ckpt>
    asset-sha256: fcbaed741e5f4e3360d058afcee3276455a958f06a84f3cfc96445d88f6f236a

license: Apache2.0

summary: FaceRecognition is used for cv

---

## Introduction

This MindSpore Hub model uses the implementation of FaceRecognition from the MindSpore model zoo on Gitee at research/cv/FaceRecognition.

FaceRecognition is a cv network. More details please refer to the MindSpore model zoo on Gitee at [research/cv/FaceRecognition](https://gitee.com/mindspore/models/blob/r1.7/research/cv/FaceRecognition/README.md).

All parameters in the module are trainable.

## Usage

```python
import mindspore_hub as mshub
from mindspore import context

context.set_context(mode=context.GRAPH_MODE,
                    device_target="Ascend",
                    device_id=0)

model = "mindspore/1.7/facerecognition_ms1mv2"
network = mshub.load(model)
network.set_train(False)

# ...
```

## Citation

Kaiming He, Xiangyu Zhang, Shaoqing Ren, Jian Sun. "Deep Residual Learning for Image Recognition"

## Disclaimer

MindSpore ("we") do not own any ownership or intellectual property rights of the datasets, and the trained models are provided on an "as is" and "as available" basis. We make no representations or warranties of any kind of the datasets and trained models (collectively, “materials”) and will not be liable for any loss, damage, expense or cost arising from the materials. Please ensure that you have permission to use the dataset under the appropriate license for the dataset and in accordance with the terms of the relevant license agreement. The trained models provided are only for research and education purposes.

To Dataset Owners: If you do not wish to have a dataset included in MindSpore, or wish to update it in any way, we will remove or update the content at your request. Please contact us through GitHub or Gitee. Your understanding and contributions to the community are greatly appreciated.

MindSpore is available under the Apache 2.0 license, please see the LICENSE file.
