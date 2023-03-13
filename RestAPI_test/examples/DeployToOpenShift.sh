#!/bin/bash

REGISTRY="$(oc get route/default-route -n openshift-image-registry -o=jsonpath='{.spec.host}')/openshift"

podman build -t ${REGISTRY}/restapi:v1 .

podman push --tls-verify=false ${REGISTRY}/restapi:v1

oc delete 