---
description: Create a Notion PRD Document with nested Sub Pages for core modules
---

## Initial Setup

1. **Locate the Parent Page**
   - Identify the parent Notion page where the module documentation will reside.
   - Example:
     ```markdown
     Create Notion Pages within the parent page at https://www.notion.so/windsurf/Migration-PRD-Docuement-225d73774c0080249c91d5aa595f1b5a 
for each module segment.
     ```

2. **Prepare Source Content**
   - Ensure analysis content (explanations, technical breakdowns, dependencies, etc.) is ready for use.
   - Structure this information in a retrievable format for the agent (e.g., a JSON payload, structured prompt, or local file).

---

## Page Creation Workflow

Instruct the agent to follow these steps for each module segment:

### 1. **Create a New Notion Page**

- Use the module name as the title.
- Nest it under the defined parent Notion page.
- Ensure consistent naming conventions for ease of reference and searchability.

### 2. **Add the Following Sections to the Page**

Each page should include the following top-level headers:

```markdown
## Overview

## Key Capabilities

## Implementation Notes

## Dependencies
```

### 3. **Populate Sections with Content**

- **Overview**: Provide a concise summary of the module’s purpose and role within the system.
- **Key Capabilities**: Detail main functions, features, and behaviors of the module.
- **Implementation Notes**: Include technical insights such as API usage, data flow, caveats, and architecture decisions.
- **Dependencies**: List internal/external systems, libraries, or services that the module depends on.

Populate each section using the analysis performed. Ensure content is complete, well-formatted, and free of placeholders.

---

## Validation Steps

After the agent completes population:

- **Confirm Creation**: Validate that the page exists under the correct parent.
- **Check Sections**: Ensure all four sections exist and are filled with relevant data.
- **Review Formatting**: Confirm that Markdown is properly rendered and consistent.
- **Spot Check Content**: Randomly review a few pages for completeness and clarity.

---