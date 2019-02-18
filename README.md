# kekseapp
POC - EKS

# Example

Can be started using

```bash
$ docker build -t kekseapp:1.0 .
$ docker run -d --name kekse -p 8080:8080 kekseapp:1.0
```

# Helm rendering

Can be rendered using

```bash
$ helm template helm --set container.repository=myrepo/kekseapp --set container.tag=1.0 --set ingress.domain=example.com
```

Can be applied to kubernetes using

```bash
$ helm template helm --set container.repository=myrepo/kekseapp --set container.tag=1.0 --set ingress.domain=example.com | kubectl apply -f -
```
