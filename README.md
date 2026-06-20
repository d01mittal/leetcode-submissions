# LeetCode Solutions — @d01mittal

My accepted LeetCode solutions, synced automatically to this repo via GitHub Actions.

## About

This repository holds my solutions to [LeetCode](https://leetcode.com/u/Light_Shot/) problems. Instead of committing each one by hand, I set up a workflow that fetches my accepted submissions and pushes them here automatically, using the [`joshcai/leetcode-sync`](https://github.com/joshcai/leetcode-sync) action.

## How it's set up

- A GitHub Actions workflow runs the sync on a weekly schedule (every Saturday, 12:00 PM IST) and can also be triggered manually from the Actions tab.
- My LeetCode `csrftoken` and `LEETCODE_SESSION` cookies are stored as encrypted GitHub Secrets so the action can read my submissions.
- Only new accepted solutions get committed — already-synced problems are skipped, so re-runs are safe and incremental.

## Structure

Each problem is saved as a single file, named by its slug:
