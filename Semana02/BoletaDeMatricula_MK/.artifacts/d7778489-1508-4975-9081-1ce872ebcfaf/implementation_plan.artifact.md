# Implementation Plan - Boleta de Matrícula Enhancements

This plan outlines the steps to add a "Turno" (Shift) selection and corresponding cost increments to the enrollment system. The work will be divided into 4 commits as requested.

## Proposed Changes

### Commit 1: Add Shift Selection and Cost Increment Logic

In this first stage, we will update the console application to:
1. Prompt the user to select a shift (M: Mañana, T: Tarde, N: Noche).
2. Calculate an additional percentage based on the selected shift:
   - **M (Mañana)**: +10%
   - **T (Tarde)**: +15%
   - **N (Noche)**: +20%
3. Apply this increment to the total cost.
4. Display the selected shift, the increment amount, and the final total.

#### [MODIFY] [Main.kt](file:///Users/tecsup/Desktop/MovilesAndroidC/Semana02/BoletaDeMatricula_MK/console/src/main/kotlin/com/gonzalo/console/Main.kt)
- Add input for `turno`.
- Implement a `when` expression to determine the increment percentage.
- Update the final summary to include shift information and the adjusted total.

---

## Verification Plan

### Manual Verification
1. Run the console application.
2. Enter student data, cost per credit, and courses.
3. Select shift 'M' and verify that the total cost is increased by 10%.
4. Repeat for 'T' (15%) and 'N' (20%).
5. Verify that invalid inputs for shift are handled (e.g., default to 0% or prompt again).
