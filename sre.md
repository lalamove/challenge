# Site Reliability Engineer Challenge

## Introduction

In Lalamove we are scaling rapidly and we need SREs to help us prevent downtime and provide visibility for our engineers into what things may go wrong.

## Requirement

1. We value a **clean**, **simple** working solution.
2. The application must be run in Docker, candidate must provide `docker-compose.yml` and `start.sh` bash script at the root of the project, which should setup all relevenat dependencies.
3. The solution must be written in Golang.
4. Candidates must submit the project as a git repository (github.com, bitbucket.com, gitlab.com). Repository must avoid containing the words `lalamove` and `challenge`.
5. Having unit/integration tests is a strong bonus.
6. The solution must be production ready with appropriate documentation.

## Problem Statement

You will build a configurable http proxy with built in observability that can be used as a kubernetes sidecar.

Feature requirements:
  - Support prometheus metrics (design appropriate metrics to be exposed).
  - Support opentracing. Should either propagate the tracing span from the caller or inject a new trace.

Bonus features:
  - Circuit breaker implementation for request failures.
  - Configurable rate limiting.
  
 
 Questions? We love to answer: techchallenge@lalamove.com
