FROM nginx:1.15.7

COPY index.html /usr/share/nginx/html/index.html

ENV STAGE=devel

CMD /bin/bash -c "sed -i 's/ENVIRONMENT/${STAGE}/g' /usr/share/nginx/html/index.html  && exec nginx -g 'daemon off;'"
