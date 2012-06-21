package org.intellij.plugins.export.keymap.model

import org.intellij.plugins.export.keymap.Bundle

/**
 * @author Denis Zhdanov
 * @since 6/21/12 1:13 PM
 */
class CommonActionsProfile extends ActionsProfile {

  CommonActionsProfile() {
    name = Bundle.message("profile.name.default")
    entries = [new Header(depth: 0, name: 'Editing'),
      new ActionData(id: ['CodeCompletion'], description: 'Basic code completion (the name of any class, method or variable)'),
      new ActionData(id: ['SmartTypeCompletion'], description: '''Smart code completion (filters the list of methods and variables 
by expected type)'''),
      new ActionData(id: ['ClassNameCompletion'], description: '''Class name completion (the name of any project class 
independently of current imports)'''),
      new ActionData(id: ['EditorCompleteStatement'], description: 'Complete statement'),
      new ActionData(id: ['ParameterInfo']),
      new ActionData(id: ['QuickJavaDoc']),
      new ActionData(id: ['ExternalJavaDoc']),
      new ActionData(shortcut: 'Ctrl + mouse over code', description: 'Brief Info'),
      new ActionData(id: ['ShowErrorDescription']),
      new ActionData(id: ['NewElement'], description: 'Generate code... (Getters, Setters, Constructors, hashCode/equals, toString)'),
      new ActionData(id: ['OverrideMethods']),
      new ActionData(id: ['ImplementMethods']),
      new ActionData(id: ['SurroundWith']),
      new ActionData(id: ['CommentByLineComment']),
      new ActionData(id: ['CommentByBlockComment']),
      new ActionData(id: ['EditorSelectWord'], description: 'Select successively increasing code blocks'),
      new ActionData(id: ['EditorUnSelectWord'], description: 'Decrease current selection to previous state'),
      new ActionData(id: ['EditorContextInfo'], description: 'Show intention actions and quick-fixes'),
      new ActionData(id: ['ShowIntentionActions']),
      new ActionData(id: ['ReformatCode']),
      new ActionData(id: ['OptimizeImports']),
      new ActionData(id: ['AutoIndentLines']),
      new ActionData(id: ['EditorIndentSelection', 'EditorUnindentSelection'], description: 'Indent/Unindent selected lines'),
      new ActionData(id: ['$Cut'], description: 'Cut current line or selected block to clipboard'),
      new ActionData(id: ['$Copy'], description: 'Copy current line or selected block to clipboard'),
      new ActionData(id: ['$Paste']),
      new ActionData(id: ['PasteMultiple'], description: 'Paste from recent buffers...'),
      new ActionData(id: ['EditorDuplicate'], description: 'Duplicate current line or selected block'),
      new ActionData(id: ['EditorDeleteLine'], description: 'Delete line at caret'),
      new ActionData(id: ['EditorJoinLines'], description: 'Smart line join'),
      new ActionData(id: ['EditorSplitLine'], description: 'Smart line split'),
      new ActionData(id: ['EditorStartNewLine'], description: 'Start new line'),
      new ActionData(id: ['EditorToggleCase'], description: 'Toggle case for word at caret or selected block'),
      new ActionData(id: ['EditorCodeBlockEndWithSelection', 'EditorCodeBlockStartWithSelection'],
                     description: 'Select till code block end/start'),
      new ActionData(id: ['EditorDeleteToWordEnd'], description: 'Delete to word end'),
      new ActionData(id: ['EditorDeleteToWordStart'], description: 'Delete to word start'),
      new ActionData(id: ['ExpandRegion', 'CollapseRegion'], description: 'Expand/collapse code block'),
      new ActionData(id: ['ExpandAll'], description: 'Expand all'),
      new ActionData(id: ['CollapseAll'], description: 'Collapse all'),
      new ActionData(id: ['CloseContent']),

      new Header(depth: 0, name: 'Search/Replace'),
      new ActionData(id: ['Find']),
      new ActionData(id: ['FindNext']),
      new ActionData(id: ['FindPrevious']),
      new ActionData(id: ['Replace']),
      new ActionData(id: ['FindInPath']),
      new ActionData(id: ['ReplaceInPath']),
      new ActionData(id: ['StructuralSearchPlugin.StructuralSearchAction'], description: 'Search structurally (Ultimate Edition only)'),
      new ActionData(id: ['StructuralSearchPlugin.StructuralReplaceAction'], description: 'Replace structurally (Ultimate Edition only)'),

      new ColumnBreak(),

      new Header(depth: 0, name: 'Usage Search'),
      new ActionData(id: ['FindUsages', 'FindUsagesInFile'], description: 'Find usages / Find Usages in file'),
      new ActionData(id: ['HighlightUsagesInFile']),
      new ActionData(id: ['ShowUsages']),

      new Header(depth: 0, name: 'Compile and Run'),
      new ActionData(id: ['CompileDirty']),
      new ActionData(id: ['Compile']),
      new ActionData(id: ['ChooseRunConfiguration']),
      new ActionData(id: ['ChooseDebugConfiguration']),
      new ActionData(id: ['Run']),
      new ActionData(id: ['Debug']),
      new ActionData(id: ['RunClass']),

      new Header(depth: 0, name: 'Debugging'),
      new ActionData(id: ['StepOver']),
      new ActionData(id: ['StepInto']),
      new ActionData(id: ['SmartStepInto']),
      new ActionData(id: ['StepOut']),
      new ActionData(id: ['RunToCursor']),
      new ActionData(id: ['EvaluateExpression']),
      new ActionData(id: ['Resume']),
      new ActionData(id: ['ToggleLineBreakpoint']),
      new ActionData(id: ['ViewBreakpoints']),

      new Header(depth: 0, name: 'Navigation'),
      new ActionData(id: ['GotoClass']),
      new ActionData(id: ['GotoFile']),
      new ActionData(id: ['GotoSymbol']),
      new ActionData(id: ['NextTab', 'PreviousTab'], description: 'Go to next/previous editor tab'),
      new ActionData(id: ['JumpToLastWindow']),
      new ActionData(id: ['EditorEscape'], description: 'Go to editor (from tool window)'),
      new ActionData(id: ['HideActiveWindow']),
      new ActionData(id: ['CloseActiveTab']),
      new ActionData(id: ['GotoLine']),
      new ActionData(id: ['RecentFiles']),
      new ActionData(id: ['Back', 'Forward'], description: 'Navigate back/forward'),
      new ActionData(id: ['JumpToLastChange']),
      new ActionData(id: ['SelectIn']),
      new ActionData(id: ['GotoDeclaration']),
      new ActionData(id: ['GotoImplementation']),
      new ActionData(id: ['QuickImplementations']),
      new ActionData(id: ['GotoTypeDeclaration']),
      new ActionData(id: ['GotoSuperMethod']),
      new ActionData(id: ['MethodUp', 'MethodDown'], description: 'Go to previous/next method'),
      new ActionData(id: ['EditorCodeBlockEnd', 'EditorCodeBlockStart'], description: 'Move to code block end/start'),
      new ActionData(id: ['FileStructurePopup']),
      new ActionData(id: ['TypeHierarchy']),
      new ActionData(id: ['MethodHierarchy']),
      new ActionData(id: ['CallHierarchy']),
      new ActionData(id: ['GotoNextError', 'GotoPreviousError'], description: 'Next/previous highlighted error'),
      new ActionData(id: ['EditSource']),
      new ActionData(id: ['ShowNavBar']),
      new ActionData(id: ['ToggleBookmark']),
      new ActionData(id: ['ToggleBookmarkWithMnemonic'], description: 'Toggle bookmark with mnemonic'),
      new ActionData(id: ['GotoBookmark0', 'GotoBookmark1', 'GotoBookmark2', 'GotoBookmark3', 'GotoBookmark4', 'GotoBookmark5',
        'GotoBookmark6', 'GotoBookmark7', 'GotoBookmark8', 'GotoBookmark9'],
                     shortcut: 'Ctrl + #[0-9]',
                     description: 'Go to numbered bookmark'),
      new ActionData(id: ['ShowBookmarks']),

      new ColumnBreak(),

      new Header(depth: 0, name: 'Refactoring'),
      new ActionData(id: ['CopyElement']),
      new ActionData(id: ['Move']),
      new ActionData(id: ['SafeDelete']),
      new ActionData(id: ['RenameElement']),
      new ActionData(id: ['ChangeSignature']),
      new ActionData(id: ['Inline']),
      new ActionData(id: ['ExtractMethod']),
      new ActionData(id: ['IntroduceVariable']),
      new ActionData(id: ['IntroduceField']),
      new ActionData(id: ['IntroduceConstant']),
      new ActionData(id: ['IntroduceParameter']),

      new Header(depth: 0, name: 'VCS/Local History'),
      new ActionData(id: ['CheckinProject'], description: 'Commit project to VCS'),
      new ActionData(id: ['Vcs.UpdateProject'], description: 'Update project from VCS'),
      new ActionData(id: ['RecentChanges'], description: 'View recent changes'),
      new ActionData(id: ['Vcs.QuickListPopupAction']),

      new Header(depth: 0, name: 'Live Templates'),
      new ActionData(id: ['SurroundWithLiveTemplate']),
      new ActionData(id: ['InsertLiveTemplate']),
      new ActionData(shortcut: 'iter', description: 'Iteration according to Java SDK 1.5 style'),
      new ActionData(shortcut: 'inst', description: 'Check object type with instanceof and downcast it'),
      new ActionData(shortcut: 'itco', description: 'Iterate elements of java.util.Collection'),
      new ActionData(shortcut: 'itit', description: 'Iterate elements of java.util.Iterator'),
      new ActionData(shortcut: 'itli', description: 'Iterate elements of java.util.List'),
      new ActionData(shortcut: 'psf',  description: 'public static final'),
      new ActionData(shortcut: 'thr',  description: 'throw new'),

      new Header(depth: 0, name: 'General'),
      new ActionData(id: ['ActivateMessagesToolWindow', 'ActivateProjectToolWindow', 'ActivateFavoritesToolWindow', 'ActivateFindToolWindow',
        'ActivateRunToolWindow', 'ActivateDebugToolWindow', 'ActivateTODOToolWindow', 'ActivateStructureToolWindow',
        'ActivateHierarchyToolWindow', 'ActivateChangesToolWindow'],
                     shortcut: 'Alt + #[0-9]',
                     description: 'Open corresponding tool window'),
      new ActionData(id: ['SaveAll']),
      new ActionData(id: ['Synchronize']),
      new ActionData(id: ['ToggleFullScreen']),
      new ActionData(id: ['HideAllWindows']),
      new ActionData(id: ['AddToFavoritesPopup']),
      new ActionData(id: ['CodeInspection.OnEditor']),
      new ActionData(id: ['QuickChangeScheme']),
      new ActionData(id: ['ShowSettings']),
      new ActionData(id: ['ShowProjectStructureSettings']),
      new ActionData(id: ['GotoAction']),
      new ActionData(id: ['NextSplitter '])
    ]
  }
}