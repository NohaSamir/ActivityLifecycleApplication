# When you start another activity from one activity, what lifecycle methods get called, and in what sequence?

<img width="356" alt="On new activity opened" src="https://github.com/NohaSamir/ActivityLifecycleApplication/assets/25500250/cac68754-781e-4d8e-8ccf-7076ae17d27f">

---

# When you click on back, what lifecycle methods get called, and in what sequence?

<img width="299" alt="On Back pressed" src="https://github.com/NohaSamir/ActivityLifecycleApplication/assets/25500250/5760923b-d996-409e-8e79-250a71948e89">

---

# When you rotate the device, what lifecycle methods get called, and in what sequence?

<img width="383" alt="On Config Change" src="https://github.com/NohaSamir/ActivityLifecycleApplication/assets/25500250/0e532ff1-5941-457c-9b66-54fbe3dc3dec">

---

# Which Lifecycle method will get called when a dialog appears in an activiy?

The kind of dialog that causes [onPause()](https://developer.android.com/guide/components/activities/activity-lifecycle#onpause) to be called is a modal dialog, such as an AlertDialog or a DialogFragment. These dialogs are designed to interrupt the user flow and require immediate attention. When such a dialog is displayed, the activity's onPause() method is invoked, indicating that the activity is being partially obscured by the dialog and is no longer in the foreground.

Even though AlertDialog in Compose doesn't call onPause

