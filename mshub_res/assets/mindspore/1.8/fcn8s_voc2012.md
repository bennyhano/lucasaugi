# FCN8s

---

model-name: FCN8s

backbone-name: FCN8s

module-type: cv-semantic_segmentation

fine-tunable: True

model-version: 1.8

train-dataset: voc2012

evaluation: meanIoU62.7

author: MindSpore team

update-time: 2022-08-10

repo-link: <https://gitee.com/mindspore/models/tree/r1.8/official/cv/FCN8s>

user-id: MindSpore

used-for: inference

mindspore-version: 1.8

asset:

-
    file-format: ckpt
    asset-link: <https://download.mindspore.cn/models/r1.8/fcn8s_ascend_v180_voc2012_official_cv_meanIoU62.7.ckpt>
    asset-sha256: 154d6c082afa42ab0028f453bbb9716ac38164de359f9bcd0a47124f145a00ff

license: Apache2.0

summary: FCN8s is used for cv

---

## Introduction

This MindSpore Hub model uses the implementation of FCN8s from the MindSpore model zoo on Gitee at official/cv/FCN8s.

FCN8s is a cv network. More details please refer to the MindSpore model zoo on Gitee at [official/cv/FCN8s](https://gitee.com/mindspore/models/blob/r1.8/official/cv/FCN8s/README.md).

All parameters in the module are trainable.

## Usage

```python
import mindspore_hub as mshub
from mindspore import context

context.set_context(mode=context.GRAPH_MODE,
                    device_target="Ascend",
                    device_id=0)

model = "mindspore/1.8/fcn8s_voc2012"
network = mshub.load(model)
network.set_train(False)

# ...
```

## Citation

Long, Jonathan, Evan Shelhamer, and Trevor Darrell. "Fully convolutional networks for semantic segmentation." Proceedings of the IEEE Conference on Computer Vision and Pattern Recognition. 2015.

## Disclaimer

MindSpore ("we") do not own any ownership or intellectual property rights of the datasets, and the trained models are provided on an "as is" and "as available" basis. We make no representations or warranties of any kind of the datasets and trained models (collectively, “materials”) and will not be liable for any loss, damage, expense or cost arising from the materials. Please ensure that you have permission to use the dataset under the appropriate license for the dataset and in accordance with the terms of the relevant license agreement. The trained models provided are only for research and education purposes.

To Dataset Owners: If you do not wish to have a dataset included in MindSpore, or wish to update it in any way, we will remove or update the content at your request. Please contact us through GitHub or Gitee. Your understanding and contributions to the community are greatly appreciated.

MindSpore is available under the Apache 2.0 license, please see the LICENSE file.
