package com.olvind.mui.muiMaterial.mod

import com.olvind.mui.emotionSerialize.mod.CSSInterpolation
import com.olvind.mui.emotionSerialize.mod.Keyframes
import com.olvind.mui.emotionUtils.mod.SerializedStyles
import com.olvind.mui.muiBase.anon.PickTextareaAutosizePropshiddencolorstyl
import com.olvind.mui.muiBase.modalUnstyledModalUnstyledClassesMod.ModalUnstyledClasses
import com.olvind.mui.muiBase.portalPortalDottypesMod.PortalProps
import com.olvind.mui.muiBase.useAutocompleteUseAutocompleteMod.CreateFilterOptionsConfig
import com.olvind.mui.muiBase.useAutocompleteUseAutocompleteMod.FilterOptionsState
import com.olvind.mui.muiBase.useAutocompleteUseAutocompleteMod.UseAutocompleteProps
import com.olvind.mui.muiBase.useAutocompleteUseAutocompleteMod.UseAutocompleteReturnValue
import com.olvind.mui.muiMaterial.accordionAccordionClassesMod.AccordionClasses
import com.olvind.mui.muiMaterial.accordionAccordionMod.AccordionProps
import com.olvind.mui.muiMaterial.accordionActionsAccordionActionsClassesMod.AccordionActionsClasses
import com.olvind.mui.muiMaterial.accordionActionsAccordionActionsMod.AccordionActionsProps
import com.olvind.mui.muiMaterial.accordionDetailsAccordionDetailsClassesMod.AccordionDetailsClasses
import com.olvind.mui.muiMaterial.accordionDetailsAccordionDetailsMod.AccordionDetailsProps
import com.olvind.mui.muiMaterial.accordionSummaryAccordionSummaryClassesMod.AccordionSummaryClasses
import com.olvind.mui.muiMaterial.alertAlertClassesMod.AlertClasses
import com.olvind.mui.muiMaterial.alertAlertMod.AlertProps
import com.olvind.mui.muiMaterial.alertTitleAlertTitleClassesMod.AlertTitleClasses
import com.olvind.mui.muiMaterial.alertTitleAlertTitleMod.AlertTitleProps
import com.olvind.mui.muiMaterial.anon.ClassNameRef
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsAppBarTypeMapheader
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsAvatarTypeMapdiv
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsBackdropTypeMapdiv
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsBadgeTypeMapspan
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsBottomNavigationTyp
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsBoxTypeMapdivTheme
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsBreadcrumbsTypeMapn
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsButtonGroupTypeMapd
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsCardContentTypeMapd
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsCardHeaderTypeMapdi
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsCardMediaTypeMapdiv
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsCardTypeMapdiv
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsChipTypeMapdiv
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsContainerTypeMapdiv
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsDialogContentTextTy
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsDialogTitleTypeMapT
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsDividerTypeMaphr
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsExtendButtonBaseTyp
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsExtendButtonBaseTypAbout
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsExtendButtonBaseTypAccessKey
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsExtendButtonBaseTypAction
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsExtendButtonBaseTypActive
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsExtendButtonBaseTypAlignItems
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsExtendButtonBaseTypAriaactivedescendant
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsExtendButtonBaseTypAriaatomic
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsExtendButtonBaseTypAriaautocomplete
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsExtendButtonBaseTypAriabusy
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsExtendButtonBaseTypAriachecked
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsExtendButtonBaseTypAriacolcount
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsExtendButtonBaseTypAriacolindex
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsExtendButtonBaseTypAriacolspan
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsExtendListTypeMapLi
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsExtendListTypeMapMe
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsFormControlTypeMapd
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsFormHelperTextTypeM
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsFormLabelTypeMaplab
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsGrid2TypeMapdiv
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsGridTypeMapdiv
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsImageListItemTypeMa
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsImageListTypeMapul
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsInputAdornmentTypeM
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsInputLabelTypeMapla
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsLinkTypeMapa
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsListItemTypeMapli
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsListSubheaderTypeMa
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsModalTypeMapdiv
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsPaginationItemTypeM
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsPaperTypeMapdiv
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsScopedCssBaselineTy
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsSkeletonTypeMapspan
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsSliderTypeMapspan
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsStackTypeMapdiv
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsStepTypeMapdiv
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsStepperTypeMapdiv
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsTableBodyTypeMaptbo
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsTableContainerTypeM
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsTableFooterTypeMapt
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsTableHeadTypeMapthe
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsTablePaginationType
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsTableRowTypeMaptr
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsTableTypeMaptable
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsTabsTypeMappropsOve
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsToolbarTypeMapdiv
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsTypographyTypeMapsp
import com.olvind.mui.muiMaterial.anon.NameProps
import com.olvind.mui.muiMaterial.anon.OmitPopperUnstyledPropsdivdirectionRefAt
import com.olvind.mui.muiMaterial.anon.OmitThemepaletteCssVarsTheme
import com.olvind.mui.muiMaterial.anon.OverridableComponentSvgIconTypeMapsvg
import com.olvind.mui.muiMaterial.anon.OverridePropsExtendButtonBaseTypeMapAcco
import com.olvind.mui.muiMaterial.anon.OverridePropsExtendButtonBaseTypeMapBott
import com.olvind.mui.muiMaterial.anon.OverridePropsExtendButtonBaseTypeMapButt
import com.olvind.mui.muiMaterial.anon.OverridePropsExtendButtonBaseTypeMapButtAbout
import com.olvind.mui.muiMaterial.anon.OverridePropsExtendButtonBaseTypeMapCard
import com.olvind.mui.muiMaterial.anon.OverridePropsExtendButtonBaseTypeMapFabT
import com.olvind.mui.muiMaterial.anon.OverridePropsExtendButtonBaseTypeMapIcon
import com.olvind.mui.muiMaterial.anon.OverridePropsExtendButtonBaseTypeMapList
import com.olvind.mui.muiMaterial.anon.OverridePropsExtendButtonBaseTypeMapListAbout
import com.olvind.mui.muiMaterial.anon.OverridePropsExtendButtonBaseTypeMapMenu
import com.olvind.mui.muiMaterial.anon.OverridePropsExtendButtonBaseTypeMapStep
import com.olvind.mui.muiMaterial.anon.OverridePropsExtendButtonBaseTypeMapTabT
import com.olvind.mui.muiMaterial.anon.OverridePropsExtendButtonBaseTypeMapTabl
import com.olvind.mui.muiMaterial.anon.OverridePropsExtendButtonBaseTypeMapTogg
import com.olvind.mui.muiMaterial.anon.PropsWithChildrenPartialCssVarsProviderC
import com.olvind.mui.muiMaterial.anon.ScrollbarColor
import com.olvind.mui.muiMaterial.anon.Style
import com.olvind.mui.muiMaterial.anon.Thumb
import com.olvind.mui.muiMaterial.appBarAppBarClassesMod.AppBarClasses
import com.olvind.mui.muiMaterial.autocompleteAutocompleteClassesMod.AutocompleteClasses
import com.olvind.mui.muiMaterial.autocompleteAutocompleteMod.AutocompleteProps
import com.olvind.mui.muiMaterial.avatarAvatarClassesMod.AvatarClasses
import com.olvind.mui.muiMaterial.avatarGroupAvatarGroupClassesMod.AvatarGroupClasses
import com.olvind.mui.muiMaterial.avatarGroupAvatarGroupMod.AvatarGroupProps
import com.olvind.mui.muiMaterial.backdropBackdropClassesMod.BackdropClasses
import com.olvind.mui.muiMaterial.backdropBackdropMod.BackdropRootProps
import com.olvind.mui.muiMaterial.badgeBadgeClassesMod.BadgeClasses
import com.olvind.mui.muiMaterial.badgeBadgeMod.BadgeBadgeProps
import com.olvind.mui.muiMaterial.badgeBadgeMod.BadgeRootProps
import com.olvind.mui.muiMaterial.bottomNavigationActionBottomNavigationActionClassesMod.BottomNavigationActionClasses
import com.olvind.mui.muiMaterial.bottomNavigationBottomNavigationClassesMod.BottomNavigationClasses
import com.olvind.mui.muiMaterial.breadcrumbsBreadcrumbsClassesMod.BreadcrumbsClasses
import com.olvind.mui.muiMaterial.buttonBaseButtonBaseClassesMod.ButtonBaseClasses
import com.olvind.mui.muiMaterial.buttonBaseTouchRippleClassesMod.TouchRippleClasses
import com.olvind.mui.muiMaterial.buttonButtonClassesMod.ButtonClasses
import com.olvind.mui.muiMaterial.buttonGroupButtonGroupClassesMod.ButtonGroupClasses
import com.olvind.mui.muiMaterial.cardActionAreaCardActionAreaClassesMod.CardActionAreaClasses
import com.olvind.mui.muiMaterial.cardActionsCardActionsClassesMod.CardActionsClasses
import com.olvind.mui.muiMaterial.cardActionsCardActionsMod.CardActionsProps
import com.olvind.mui.muiMaterial.cardCardClassesMod.CardClasses
import com.olvind.mui.muiMaterial.cardContentCardContentClassesMod.CardContentClasses
import com.olvind.mui.muiMaterial.cardHeaderCardHeaderClassesMod.CardHeaderClasses
import com.olvind.mui.muiMaterial.cardMediaCardMediaClassesMod.CardMediaClasses
import com.olvind.mui.muiMaterial.checkboxCheckboxClassesMod.CheckboxClasses
import com.olvind.mui.muiMaterial.checkboxCheckboxMod.CheckboxProps
import com.olvind.mui.muiMaterial.chipChipClassesMod.ChipClasses
import com.olvind.mui.muiMaterial.circularProgressCircularProgressClassesMod.CircularProgressClasses
import com.olvind.mui.muiMaterial.circularProgressCircularProgressMod.CircularProgressProps
import com.olvind.mui.muiMaterial.collapseCollapseClassesMod.CollapseClasses
import com.olvind.mui.muiMaterial.collapseCollapseMod.CollapseProps
import com.olvind.mui.muiMaterial.cssBaselineCssBaselineMod.CssBaselineProps
import com.olvind.mui.muiMaterial.dialogActionsDialogActionsClassesMod.DialogActionsClasses
import com.olvind.mui.muiMaterial.dialogActionsDialogActionsMod.DialogActionsProps
import com.olvind.mui.muiMaterial.dialogContentDialogContentClassesMod.DialogContentClasses
import com.olvind.mui.muiMaterial.dialogContentDialogContentMod.DialogContentProps
import com.olvind.mui.muiMaterial.dialogContentTextDialogContentTextClassesMod.DialogContentTextClasses
import com.olvind.mui.muiMaterial.dialogDialogClassesMod.DialogClasses
import com.olvind.mui.muiMaterial.dialogDialogMod.DialogProps
import com.olvind.mui.muiMaterial.dialogTitleDialogTitleClassesMod.DialogTitleClasses
import com.olvind.mui.muiMaterial.dividerDividerClassesMod.DividerClasses
import com.olvind.mui.muiMaterial.drawerDrawerClassesMod.DrawerClasses
import com.olvind.mui.muiMaterial.drawerDrawerMod.DrawerProps
import com.olvind.mui.muiMaterial.fabFabClassesMod.FabClasses
import com.olvind.mui.muiMaterial.fadeFadeMod.FadeProps
import com.olvind.mui.muiMaterial.filledInputFilledInputClassesMod.FilledInputClasses
import com.olvind.mui.muiMaterial.formControlFormControlClassesMod.FormControlClasses
import com.olvind.mui.muiMaterial.formControlFormControlContextMod.FormControlState
import com.olvind.mui.muiMaterial.formControlLabelFormControlLabelClassesMod.FormControlLabelClasses
import com.olvind.mui.muiMaterial.formControlLabelFormControlLabelMod.FormControlLabelProps
import com.olvind.mui.muiMaterial.formGroupFormGroupClassesMod.FormGroupClasses
import com.olvind.mui.muiMaterial.formGroupFormGroupMod.FormGroupProps
import com.olvind.mui.muiMaterial.formHelperTextFormHelperTextClassesMod.FormHelperTextClasses
import com.olvind.mui.muiMaterial.formLabelFormLabelClassesMod.FormLabelClasses
import com.olvind.mui.muiMaterial.globalStylesGlobalStylesMod.GlobalStylesProps
import com.olvind.mui.muiMaterial.growGrowMod.GrowProps
import com.olvind.mui.muiMaterial.hiddenHiddenMod.HiddenProps
import com.olvind.mui.muiMaterial.iconButtonIconButtonClassesMod.IconButtonClasses
import com.olvind.mui.muiMaterial.iconIconClassesMod.IconClasses
import com.olvind.mui.muiMaterial.imageListImageListClassesMod.ImageListClasses
import com.olvind.mui.muiMaterial.imageListItemBarImageListItemBarClassesMod.ImageListItemBarClasses
import com.olvind.mui.muiMaterial.imageListItemBarImageListItemBarMod.ImageListItemBarProps
import com.olvind.mui.muiMaterial.imageListItemImageListItemClassesMod.ImageListItemClasses
import com.olvind.mui.muiMaterial.inputAdornmentInputAdornmentClassesMod.InputAdornmentClasses
import com.olvind.mui.muiMaterial.inputBaseInputBaseClassesMod.InputBaseClasses
import com.olvind.mui.muiMaterial.inputBaseInputBaseMod.InputBaseProps
import com.olvind.mui.muiMaterial.inputInputClassesMod.InputClasses
import com.olvind.mui.muiMaterial.inputLabelInputLabelClassesMod.InputLabelClasses
import com.olvind.mui.muiMaterial.linearProgressLinearProgressClassesMod.LinearProgressClasses
import com.olvind.mui.muiMaterial.linearProgressLinearProgressMod.LinearProgressProps
import com.olvind.mui.muiMaterial.linkLinkClassesMod.LinkClasses
import com.olvind.mui.muiMaterial.listItemAvatarListItemAvatarClassesMod.ListItemAvatarClasses
import com.olvind.mui.muiMaterial.listItemAvatarListItemAvatarMod.ListItemAvatarProps
import com.olvind.mui.muiMaterial.listItemButtonListItemButtonClassesMod.ListItemButtonClasses
import com.olvind.mui.muiMaterial.listItemIconListItemIconClassesMod.ListItemIconClasses
import com.olvind.mui.muiMaterial.listItemIconListItemIconMod.ListItemIconProps
import com.olvind.mui.muiMaterial.listItemListItemClassesMod.ListItemClasses
import com.olvind.mui.muiMaterial.listItemSecondaryActionListItemSecondaryActionClassesMod.ListItemSecondaryActionClasses
import com.olvind.mui.muiMaterial.listItemTextListItemTextClassesMod.ListItemTextClasses
import com.olvind.mui.muiMaterial.listItemTextListItemTextMod.ListItemTextProps
import com.olvind.mui.muiMaterial.listListClassesMod.ListClasses
import com.olvind.mui.muiMaterial.listSubheaderListSubheaderClassesMod.ListSubheaderClasses
import com.olvind.mui.muiMaterial.menuItemMenuItemClassesMod.MenuItemClasses
import com.olvind.mui.muiMaterial.menuMenuClassesMod.MenuClasses
import com.olvind.mui.muiMaterial.menuMenuMod.MenuProps
import com.olvind.mui.muiMaterial.mobileStepperMobileStepperClassesMod.MobileStepperClasses
import com.olvind.mui.muiMaterial.mobileStepperMobileStepperMod.MobileStepperProps
import com.olvind.mui.muiMaterial.mod.^
import com.olvind.mui.muiMaterial.modalModalMod.ModalClasses_
import com.olvind.mui.muiMaterial.modalModalMod.ModalRootProps
import com.olvind.mui.muiMaterial.nativeSelectNativeSelectClassesMod.NativeSelectClasses
import com.olvind.mui.muiMaterial.outlinedInputOutlinedInputClassesMod.OutlinedInputClasses
import com.olvind.mui.muiMaterial.paginationItemPaginationItemClassesMod.PaginationItemClasses
import com.olvind.mui.muiMaterial.paginationPaginationClassesMod.PaginationClasses
import com.olvind.mui.muiMaterial.paginationPaginationMod.PaginationProps
import com.olvind.mui.muiMaterial.paperPaperClassesMod.PaperClasses
import com.olvind.mui.muiMaterial.popoverPopoverClassesMod.PopoverClasses
import com.olvind.mui.muiMaterial.popoverPopoverMod.PopoverProps
import com.olvind.mui.muiMaterial.radioGroupRadioGroupMod.RadioGroupProps
import com.olvind.mui.muiMaterial.radioGroupUseRadioGroupMod.RadioGroupState
import com.olvind.mui.muiMaterial.radioRadioClassesMod.RadioClasses
import com.olvind.mui.muiMaterial.radioRadioMod.RadioProps
import com.olvind.mui.muiMaterial.ratingRatingClassesMod.RatingClasses
import com.olvind.mui.muiMaterial.ratingRatingMod.RatingProps
import com.olvind.mui.muiMaterial.selectSelectClassesMod.SelectClasses
import com.olvind.mui.muiMaterial.skeletonSkeletonClassesMod.SkeletonClasses
import com.olvind.mui.muiMaterial.slideSlideMod.SlideProps
import com.olvind.mui.muiMaterial.sliderSliderClassesMod.SliderClasses
import com.olvind.mui.muiMaterial.sliderSliderMod.SliderMarkLabelProps
import com.olvind.mui.muiMaterial.sliderSliderMod.SliderMarkProps
import com.olvind.mui.muiMaterial.sliderSliderMod.SliderRailProps
import com.olvind.mui.muiMaterial.sliderSliderMod.SliderRootProps
import com.olvind.mui.muiMaterial.sliderSliderMod.SliderThumbProps
import com.olvind.mui.muiMaterial.sliderSliderMod.SliderTrackProps
import com.olvind.mui.muiMaterial.sliderSliderMod.SliderValueLabelProps
import com.olvind.mui.muiMaterial.snackbarContentSnackbarContentClassesMod.SnackbarContentClasses
import com.olvind.mui.muiMaterial.snackbarContentSnackbarContentMod.SnackbarContentProps
import com.olvind.mui.muiMaterial.snackbarSnackbarClassesMod.SnackbarClasses
import com.olvind.mui.muiMaterial.snackbarSnackbarMod.SnackbarProps
import com.olvind.mui.muiMaterial.speedDialActionSpeedDialActionClassesMod.SpeedDialActionClasses
import com.olvind.mui.muiMaterial.speedDialActionSpeedDialActionMod.SpeedDialActionProps
import com.olvind.mui.muiMaterial.speedDialIconSpeedDialIconClassesMod.SpeedDialIconClasses
import com.olvind.mui.muiMaterial.speedDialSpeedDialClassesMod.SpeedDialClasses
import com.olvind.mui.muiMaterial.speedDialSpeedDialMod.SpeedDialProps
import com.olvind.mui.muiMaterial.stepButtonStepButtonClassesMod.StepButtonClasses
import com.olvind.mui.muiMaterial.stepConnectorStepConnectorClassesMod.StepConnectorClasses
import com.olvind.mui.muiMaterial.stepConnectorStepConnectorMod.StepConnectorProps
import com.olvind.mui.muiMaterial.stepContentStepContentClassesMod.StepContentClasses
import com.olvind.mui.muiMaterial.stepContentStepContentMod.StepContentProps
import com.olvind.mui.muiMaterial.stepIconStepIconClassesMod.StepIconClasses
import com.olvind.mui.muiMaterial.stepIconStepIconMod.StepIconProps
import com.olvind.mui.muiMaterial.stepLabelStepLabelClassesMod.StepLabelClasses
import com.olvind.mui.muiMaterial.stepStepClassesMod.StepClasses
import com.olvind.mui.muiMaterial.stepStepContextMod.StepContextType
import com.olvind.mui.muiMaterial.stepperStepperClassesMod.StepperClasses
import com.olvind.mui.muiMaterial.stepperStepperContextMod.StepperContextType
import com.olvind.mui.muiMaterial.stylesAdaptV4ThemeMod.DeprecatedThemeOptions
import com.olvind.mui.muiMaterial.stylesCreatePaletteMod.Palette
import com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme
import com.olvind.mui.muiMaterial.stylesCreateThemeMod.ThemeOptions
import com.olvind.mui.muiMaterial.stylesCreateTransitionsMod.Duration_
import com.olvind.mui.muiMaterial.stylesCreateTransitionsMod.Easing_
import com.olvind.mui.muiMaterial.stylesCreateTypographyMod.TypographyOptions
import com.olvind.mui.muiMaterial.stylesExperimentalExtendThemeMod.CssVarsThemeOptions
import com.olvind.mui.muiMaterial.stylesMod.StyledComponentProps
import com.olvind.mui.muiMaterial.stylesResponsiveFontSizesMod.ResponsiveFontSizesOptions
import com.olvind.mui.muiMaterial.stylesThemeProviderMod.ThemeProviderProps
import com.olvind.mui.muiMaterial.stylesUseThemePropsMod.ThemeWithProps
import com.olvind.mui.muiMaterial.stylesUseThemePropsMod.ThemedProps
import com.olvind.mui.muiMaterial.svgIconSvgIconClassesMod.SvgIconClasses
import com.olvind.mui.muiMaterial.swipeableDrawerSwipeableDrawerMod.SwipeableDrawerProps
import com.olvind.mui.muiMaterial.switchSwitchClassesMod.SwitchClasses
import com.olvind.mui.muiMaterial.switchSwitchMod.SwitchProps
import com.olvind.mui.muiMaterial.tabScrollButtonTabScrollButtonClassesMod.TabScrollButtonClasses
import com.olvind.mui.muiMaterial.tabScrollButtonTabScrollButtonMod.TabScrollButtonProps
import com.olvind.mui.muiMaterial.tabTabClassesMod.TabClasses
import com.olvind.mui.muiMaterial.tableBodyTableBodyClassesMod.TableBodyClasses
import com.olvind.mui.muiMaterial.tableCellTableCellClassesMod.TableCellClasses
import com.olvind.mui.muiMaterial.tableCellTableCellMod.TableCellProps
import com.olvind.mui.muiMaterial.tableContainerTableContainerClassesMod.TableContainerClasses
import com.olvind.mui.muiMaterial.tableFooterTableFooterClassesMod.TableFooterClasses
import com.olvind.mui.muiMaterial.tableHeadTableHeadClassesMod.TableHeadClasses
import com.olvind.mui.muiMaterial.tablePaginationTablePaginationClassesMod.TablePaginationClasses
import com.olvind.mui.muiMaterial.tableRowTableRowClassesMod.TableRowClasses
import com.olvind.mui.muiMaterial.tableSortLabelTableSortLabelClassesMod.TableSortLabelClasses
import com.olvind.mui.muiMaterial.tableTableClassesMod.TableClasses
import com.olvind.mui.muiMaterial.tabsTabsClassesMod.TabsClasses
import com.olvind.mui.muiMaterial.textFieldTextFieldClassesMod.TextFieldClasses
import com.olvind.mui.muiMaterial.textFieldTextFieldMod.TextFieldProps
import com.olvind.mui.muiMaterial.toggleButtonGroupToggleButtonGroupClassesMod.ToggleButtonGroupClasses
import com.olvind.mui.muiMaterial.toggleButtonGroupToggleButtonGroupMod.ToggleButtonGroupProps
import com.olvind.mui.muiMaterial.toggleButtonToggleButtonClassesMod.ToggleButtonClasses
import com.olvind.mui.muiMaterial.toolbarToolbarClassesMod.ToolbarClasses
import com.olvind.mui.muiMaterial.tooltipTooltipClassesMod.TooltipClasses
import com.olvind.mui.muiMaterial.tooltipTooltipMod.TooltipProps
import com.olvind.mui.muiMaterial.typographyTypographyClassesMod.TypographyClasses
import com.olvind.mui.muiMaterial.useMediaQueryUseMediaQueryMod.UseMediaQueryOptions
import com.olvind.mui.muiMaterial.useScrollTriggerUseScrollTriggerMod.UseScrollTriggerOptions
import com.olvind.mui.muiMaterial.zoomZoomMod.ZoomProps
import com.olvind.mui.muiStyledEngine.styledEngineProviderStyledEngineProviderMod.StyledEngineProviderProps
import com.olvind.mui.muiSystem.colorManipulatorMod.ColorObject
import com.olvind.mui.muiSystem.containerContainerClassesMod.ContainerClasses
import com.olvind.mui.muiSystem.createStyledMod.CreateMUIStyled
import com.olvind.mui.muiSystem.stackStackClassesMod.StackClasses
import com.olvind.mui.muiSystem.unstableGridGridClassesMod.GridClasses
import com.olvind.mui.muiTypes.mod.DistributiveOmit
import com.olvind.mui.muiUtils.debounceMod.Cancelable
import com.olvind.mui.muiUtils.useControlledMod.UseControlledProps
import com.olvind.mui.muiUtils.useIsFocusVisibleMod.UseIsFocusVisibleResult
import com.olvind.mui.react.mod.Context
import com.olvind.mui.react.mod.DependencyList
import com.olvind.mui.react.mod.EffectCallback
import com.olvind.mui.react.mod.FC
import com.olvind.mui.react.mod.ForwardRefExoticComponent
import com.olvind.mui.react.mod.JSXElementConstructor
import com.olvind.mui.react.mod.MutableRefObject
import com.olvind.mui.react.mod.Ref
import com.olvind.mui.react.mod.RefAttributes
import com.olvind.mui.react.mod.global.JSX.Element
import com.olvind.mui.std.Record
import com.olvind.mui.std.TemplateStringsArray
import japgolly.scalajs.react.facade.React.ElementType
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.facade.React.RefFn
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.DOMRect
import org.scalajs.dom.Document
import org.scalajs.dom.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def Accordion(props: AccordionProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Accordion")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

inline def AccordionActions(props: AccordionActionsProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("AccordionActions")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

inline def AccordionDetails(props: AccordionDetailsProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("AccordionDetails")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

/**
  *
  * Demos:
  *
  * - [Accordion](https://mui.com/material-ui/react-accordion/)
  *
  * API:
  *
  * - [AccordionSummary API](https://mui.com/material-ui/api/accordion-summary/)
  * - inherits [ButtonBase API](https://mui.com/material-ui/api/button-base/)
  */
inline def AccordionSummary: js.Function1[
/* props */ OverridePropsExtendButtonBaseTypeMapAcco | DefaultComponentPropsExtendButtonBaseTyp, 
japgolly.scalajs.react.facade.React.Element | Null] = ^.asInstanceOf[js.Dynamic].selectDynamic("AccordionSummary").asInstanceOf[js.Function1[
/* props */ OverridePropsExtendButtonBaseTypeMapAcco | DefaultComponentPropsExtendButtonBaseTyp, 
japgolly.scalajs.react.facade.React.Element | Null]]

inline def Alert(props: AlertProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Alert")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

inline def AlertTitle(props: AlertTitleProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("AlertTitle")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

/**
  *
  * Demos:
  *
  * - [App Bar](https://mui.com/material-ui/react-app-bar/)
  *
  * API:
  *
  * - [AppBar API](https://mui.com/material-ui/api/app-bar/)
  * - inherits [Paper API](https://mui.com/material-ui/api/paper/)
  */
inline def AppBar: js.Function1[/* props */ DefaultComponentPropsAppBarTypeMapheader, Element] = ^.asInstanceOf[js.Dynamic].selectDynamic("AppBar").asInstanceOf[js.Function1[/* props */ DefaultComponentPropsAppBarTypeMapheader, Element]]

@scala.annotation.targetName("Autocomplete_div")
inline def Autocomplete[T, Multiple /* <: js.UndefOr[Boolean] */, DisableClearable /* <: js.UndefOr[Boolean] */, FreeSolo /* <: js.UndefOr[Boolean] */](props: AutocompleteProps[T, Multiple, DisableClearable, FreeSolo, "div"]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Autocomplete")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

/**
  *
  * Demos:
  *
  * - [Avatar](https://mui.com/material-ui/react-avatar/)
  *
  * API:
  *
  * - [Avatar API](https://mui.com/material-ui/api/avatar/)
  */
inline def Avatar: js.Function1[/* props */ DefaultComponentPropsAvatarTypeMapdiv, Element] = ^.asInstanceOf[js.Dynamic].selectDynamic("Avatar").asInstanceOf[js.Function1[/* props */ DefaultComponentPropsAvatarTypeMapdiv, Element]]

inline def AvatarGroup(props: AvatarGroupProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("AvatarGroup")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

/**
  *
  * Demos:
  *
  * - [Backdrop](https://mui.com/material-ui/react-backdrop/)
  *
  * API:
  *
  * - [Backdrop API](https://mui.com/material-ui/api/backdrop/)
  * - inherits [Fade API](https://mui.com/material-ui/api/fade/)
  */
inline def Backdrop: js.Function1[/* props */ DefaultComponentPropsBackdropTypeMapdiv, Element] = ^.asInstanceOf[js.Dynamic].selectDynamic("Backdrop").asInstanceOf[js.Function1[/* props */ DefaultComponentPropsBackdropTypeMapdiv, Element]]

inline def BackdropRoot: FC[BackdropRootProps] = ^.asInstanceOf[js.Dynamic].selectDynamic("BackdropRoot").asInstanceOf[FC[BackdropRootProps]]

/**
  *
  * Demos:
  *
  * - [Avatar](https://mui.com/material-ui/react-avatar/)
  * - [Badge](https://mui.com/material-ui/react-badge/)
  *
  * API:
  *
  * - [Badge API](https://mui.com/material-ui/api/badge/)
  */
inline def Badge: js.Function1[/* props */ DefaultComponentPropsBadgeTypeMapspan, Element] = ^.asInstanceOf[js.Dynamic].selectDynamic("Badge").asInstanceOf[js.Function1[/* props */ DefaultComponentPropsBadgeTypeMapspan, Element]]

inline def BadgeMark: FC[BadgeBadgeProps] = ^.asInstanceOf[js.Dynamic].selectDynamic("BadgeMark").asInstanceOf[FC[BadgeBadgeProps]]

inline def BadgeRoot: FC[BadgeRootProps] = ^.asInstanceOf[js.Dynamic].selectDynamic("BadgeRoot").asInstanceOf[FC[BadgeRootProps]]

/**
  *
  * Demos:
  *
  * - [Bottom Navigation](https://mui.com/material-ui/react-bottom-navigation/)
  *
  * API:
  *
  * - [BottomNavigation API](https://mui.com/material-ui/api/bottom-navigation/)
  */
inline def BottomNavigation: js.Function1[/* props */ DefaultComponentPropsBottomNavigationTyp, Element] = ^.asInstanceOf[js.Dynamic].selectDynamic("BottomNavigation").asInstanceOf[js.Function1[/* props */ DefaultComponentPropsBottomNavigationTyp, Element]]

/**
  *
  * Demos:
  *
  * - [Bottom Navigation](https://mui.com/material-ui/react-bottom-navigation/)
  *
  * API:
  *
  * - [BottomNavigationAction API](https://mui.com/material-ui/api/bottom-navigation-action/)
  * - inherits [ButtonBase API](https://mui.com/material-ui/api/button-base/)
  */
inline def BottomNavigationAction: js.Function1[
/* props */ OverridePropsExtendButtonBaseTypeMapBott | DefaultComponentPropsExtendButtonBaseTypAbout, 
japgolly.scalajs.react.facade.React.Element | Null] = ^.asInstanceOf[js.Dynamic].selectDynamic("BottomNavigationAction").asInstanceOf[js.Function1[
/* props */ OverridePropsExtendButtonBaseTypeMapBott | DefaultComponentPropsExtendButtonBaseTypAbout, 
japgolly.scalajs.react.facade.React.Element | Null]]

/**
  *
  * Demos:
  *
  * - [Box](https://mui.com/material-ui/react-box/)
  *
  * API:
  *
  * - [Box API](https://mui.com/material-ui/api/box/)
  */
inline def Box: js.Function1[/* props */ DefaultComponentPropsBoxTypeMapdivTheme, Element | Null] = ^.asInstanceOf[js.Dynamic].selectDynamic("Box").asInstanceOf[js.Function1[/* props */ DefaultComponentPropsBoxTypeMapdivTheme, Element | Null]]

/**
  *
  * Demos:
  *
  * - [Breadcrumbs](https://mui.com/material-ui/react-breadcrumbs/)
  *
  * API:
  *
  * - [Breadcrumbs API](https://mui.com/material-ui/api/breadcrumbs/)
  */
inline def Breadcrumbs: js.Function1[/* props */ DefaultComponentPropsBreadcrumbsTypeMapn, Element] = ^.asInstanceOf[js.Dynamic].selectDynamic("Breadcrumbs").asInstanceOf[js.Function1[/* props */ DefaultComponentPropsBreadcrumbsTypeMapn, Element]]

/**
  *
  * Demos:
  *
  * - [Button Group](https://mui.com/material-ui/react-button-group/)
  * - [Button](https://mui.com/material-ui/react-button/)
  *
  * API:
  *
  * - [Button API](https://mui.com/material-ui/api/button/)
  * - inherits [ButtonBase API](https://mui.com/material-ui/api/button-base/)
  */
inline def Button: js.Function1[
/* props */ OverridePropsExtendButtonBaseTypeMapButt | DefaultComponentPropsExtendButtonBaseTypAccessKey, 
japgolly.scalajs.react.facade.React.Element | Null] = ^.asInstanceOf[js.Dynamic].selectDynamic("Button").asInstanceOf[js.Function1[
/* props */ OverridePropsExtendButtonBaseTypeMapButt | DefaultComponentPropsExtendButtonBaseTypAccessKey, 
japgolly.scalajs.react.facade.React.Element | Null]]

/**
  * `ButtonBase` contains as few styles as possible.
  * It aims to be a simple building block for creating a button.
  * It contains a load of style reset and some focus/ripple logic.
  *
  * Demos:
  *
  * - [Button](https://mui.com/material-ui/react-button/)
  *
  * API:
  *
  * - [ButtonBase API](https://mui.com/material-ui/api/button-base/)
  */
inline def ButtonBase: js.Function1[
/* props */ OverridePropsExtendButtonBaseTypeMapButtAbout | DefaultComponentPropsExtendButtonBaseTypAction, 
japgolly.scalajs.react.facade.React.Element | Null] = ^.asInstanceOf[js.Dynamic].selectDynamic("ButtonBase").asInstanceOf[js.Function1[
/* props */ OverridePropsExtendButtonBaseTypeMapButtAbout | DefaultComponentPropsExtendButtonBaseTypAction, 
japgolly.scalajs.react.facade.React.Element | Null]]

/**
  *
  * Demos:
  *
  * - [Button Group](https://mui.com/material-ui/react-button-group/)
  *
  * API:
  *
  * - [ButtonGroup API](https://mui.com/material-ui/api/button-group/)
  */
inline def ButtonGroup: js.Function1[/* props */ DefaultComponentPropsButtonGroupTypeMapd, Element] = ^.asInstanceOf[js.Dynamic].selectDynamic("ButtonGroup").asInstanceOf[js.Function1[/* props */ DefaultComponentPropsButtonGroupTypeMapd, Element]]

/**
  *
  * Demos:
  *
  * - [Card](https://mui.com/material-ui/react-card/)
  *
  * API:
  *
  * - [Card API](https://mui.com/material-ui/api/card/)
  * - inherits [Paper API](https://mui.com/material-ui/api/paper/)
  */
inline def Card: js.Function1[/* props */ DefaultComponentPropsCardTypeMapdiv, Element] = ^.asInstanceOf[js.Dynamic].selectDynamic("Card").asInstanceOf[js.Function1[/* props */ DefaultComponentPropsCardTypeMapdiv, Element]]

/**
  *
  * Demos:
  *
  * - [Card](https://mui.com/material-ui/react-card/)
  *
  * API:
  *
  * - [CardActionArea API](https://mui.com/material-ui/api/card-action-area/)
  * - inherits [ButtonBase API](https://mui.com/material-ui/api/button-base/)
  */
inline def CardActionArea: js.Function1[
/* props */ OverridePropsExtendButtonBaseTypeMapCard | DefaultComponentPropsExtendButtonBaseTypAriaactivedescendant, 
japgolly.scalajs.react.facade.React.Element | Null] = ^.asInstanceOf[js.Dynamic].selectDynamic("CardActionArea").asInstanceOf[js.Function1[
/* props */ OverridePropsExtendButtonBaseTypeMapCard | DefaultComponentPropsExtendButtonBaseTypAriaactivedescendant, 
japgolly.scalajs.react.facade.React.Element | Null]]

inline def CardActions(props: CardActionsProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("CardActions")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

/**
  *
  * Demos:
  *
  * - [Card](https://mui.com/material-ui/react-card/)
  *
  * API:
  *
  * - [CardContent API](https://mui.com/material-ui/api/card-content/)
  */
inline def CardContent: js.Function1[/* props */ DefaultComponentPropsCardContentTypeMapd, Element] = ^.asInstanceOf[js.Dynamic].selectDynamic("CardContent").asInstanceOf[js.Function1[/* props */ DefaultComponentPropsCardContentTypeMapd, Element]]

/**
  *
  * Demos:
  *
  * - [Card](https://mui.com/material-ui/react-card/)
  *
  * API:
  *
  * - [CardHeader API](https://mui.com/material-ui/api/card-header/)
  */
inline def CardHeader: js.Function1[/* props */ DefaultComponentPropsCardHeaderTypeMapdi, Element] = ^.asInstanceOf[js.Dynamic].selectDynamic("CardHeader").asInstanceOf[js.Function1[/* props */ DefaultComponentPropsCardHeaderTypeMapdi, Element]]

/**
  *
  * Demos:
  *
  * - [Card](https://mui.com/material-ui/react-card/)
  *
  * API:
  *
  * - [CardMedia API](https://mui.com/material-ui/api/card-media/)
  */
inline def CardMedia: js.Function1[/* props */ DefaultComponentPropsCardMediaTypeMapdiv, Element] = ^.asInstanceOf[js.Dynamic].selectDynamic("CardMedia").asInstanceOf[js.Function1[/* props */ DefaultComponentPropsCardMediaTypeMapdiv, Element]]

inline def Checkbox(props: CheckboxProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Checkbox")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

/**
  * Chips represent complex entities in small blocks, such as a contact.
  *
  * Demos:
  *
  * - [Chip](https://mui.com/material-ui/react-chip/)
  *
  * API:
  *
  * - [Chip API](https://mui.com/material-ui/api/chip/)
  */
inline def Chip: js.Function1[/* props */ DefaultComponentPropsChipTypeMapdiv, Element] = ^.asInstanceOf[js.Dynamic].selectDynamic("Chip").asInstanceOf[js.Function1[/* props */ DefaultComponentPropsChipTypeMapdiv, Element]]

inline def CircularProgress(props: CircularProgressProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("CircularProgress")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

inline def Collapse(props: CollapseProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Collapse")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

/**
  *
  * Demos:
  *
  * - [Container](https://mui.com/material-ui/react-container/)
  *
  * API:
  *
  * - [Container API](https://mui.com/material-ui/api/container/)
  */
inline def Container: js.Function1[/* props */ DefaultComponentPropsContainerTypeMapdiv, Element] = ^.asInstanceOf[js.Dynamic].selectDynamic("Container").asInstanceOf[js.Function1[/* props */ DefaultComponentPropsContainerTypeMapdiv, Element]]

inline def CssBaseline(props: CssBaselineProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("CssBaseline")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

inline def Dialog(props: DialogProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Dialog")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

inline def DialogActions(props: DialogActionsProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("DialogActions")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

inline def DialogContent(props: DialogContentProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("DialogContent")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

/**
  *
  * Demos:
  *
  * - [Dialog](https://mui.com/material-ui/react-dialog/)
  *
  * API:
  *
  * - [DialogContentText API](https://mui.com/material-ui/api/dialog-content-text/)
  * - inherits [Typography API](https://mui.com/material-ui/api/typography/)
  */
inline def DialogContentText: js.Function1[/* props */ DefaultComponentPropsDialogContentTextTy, Element] = ^.asInstanceOf[js.Dynamic].selectDynamic("DialogContentText").asInstanceOf[js.Function1[/* props */ DefaultComponentPropsDialogContentTextTy, Element]]

/**
  *
  * Demos:
  *
  * - [Dialog](https://mui.com/material-ui/react-dialog/)
  *
  * API:
  *
  * - [DialogTitle API](https://mui.com/material-ui/api/dialog-title/)
  */
inline def DialogTitle: js.Function1[/* props */ DefaultComponentPropsDialogTitleTypeMapT, Element] = ^.asInstanceOf[js.Dynamic].selectDynamic("DialogTitle").asInstanceOf[js.Function1[/* props */ DefaultComponentPropsDialogTitleTypeMapT, Element]]

/**
  *
  * Demos:
  *
  * - [Divider](https://mui.com/material-ui/react-divider/)
  * - [Lists](https://mui.com/material-ui/react-list/)
  *
  * API:
  *
  * - [Divider API](https://mui.com/material-ui/api/divider/)
  */
inline def Divider: js.Function1[/* props */ DefaultComponentPropsDividerTypeMaphr, Element] = ^.asInstanceOf[js.Dynamic].selectDynamic("Divider").asInstanceOf[js.Function1[/* props */ DefaultComponentPropsDividerTypeMaphr, Element]]

inline def Drawer(props: DrawerProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Drawer")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

/* import warning: parser.TsParser#tsDeclVar Dropped IArray(useColorScheme, getInitColorSchemeScript) */ inline def ExperimentalCssVarsProvider(props: PropsWithChildrenPartialCssVarsProviderC): japgolly.scalajs.react.facade.React.Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Experimental_CssVarsProvider")(props.asInstanceOf[js.Any]).asInstanceOf[japgolly.scalajs.react.facade.React.Element]

/**
  *
  * Demos:
  *
  * - [Floating Action Button](https://mui.com/material-ui/react-floating-action-button/)
  *
  * API:
  *
  * - [Fab API](https://mui.com/material-ui/api/fab/)
  * - inherits [ButtonBase API](https://mui.com/material-ui/api/button-base/)
  */
inline def Fab: js.Function1[
/* props */ OverridePropsExtendButtonBaseTypeMapFabT | DefaultComponentPropsExtendButtonBaseTypAriaatomic, 
japgolly.scalajs.react.facade.React.Element | Null] = ^.asInstanceOf[js.Dynamic].selectDynamic("Fab").asInstanceOf[js.Function1[
/* props */ OverridePropsExtendButtonBaseTypeMapFabT | DefaultComponentPropsExtendButtonBaseTypAriaatomic, 
japgolly.scalajs.react.facade.React.Element | Null]]

inline def Fade(props: FadeProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Fade")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

/**
  * Provides context such as filled/focused/error/required for form inputs.
  * Relying on the context provides high flexibility and ensures that the state always stays
  * consistent across the children of the `FormControl`.
  * This context is used by the following components:
  *
  * *   FormLabel
  * *   FormHelperText
  * *   Input
  * *   InputLabel
  *
  * You can find one composition example below and more going to [the demos](https://mui.com/material-ui/react-text-field/#components).
  *
  * ```jsx
  * <FormControl>
  *   <InputLabel htmlFor="my-input">Email address</InputLabel>
  *   <Input id="my-input" aria-describedby="my-helper-text" />
  *   <FormHelperText id="my-helper-text">We'll never share your email.</FormHelperText>
  * </FormControl>
  * ```
  *
  * ⚠️ Only one `InputBase` can be used within a FormControl because it creates visual inconsistencies.
  * For instance, only one input can be focused at the same time, the state shouldn't be shared.
  *
  * Demos:
  *
  * - [Checkbox](https://mui.com/material-ui/react-checkbox/)
  * - [Radio Group](https://mui.com/material-ui/react-radio-button/)
  * - [Switch](https://mui.com/material-ui/react-switch/)
  * - [Text Field](https://mui.com/material-ui/react-text-field/)
  *
  * API:
  *
  * - [FormControl API](https://mui.com/material-ui/api/form-control/)
  */
inline def FormControl: js.Function1[/* props */ DefaultComponentPropsFormControlTypeMapd, Element] = ^.asInstanceOf[js.Dynamic].selectDynamic("FormControl").asInstanceOf[js.Function1[/* props */ DefaultComponentPropsFormControlTypeMapd, Element]]

inline def FormControlLabel(props: FormControlLabelProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FormControlLabel")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

inline def FormGroup(props: FormGroupProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FormGroup")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

/**
  *
  * Demos:
  *
  * - [Text Field](https://mui.com/material-ui/react-text-field/)
  *
  * API:
  *
  * - [FormHelperText API](https://mui.com/material-ui/api/form-helper-text/)
  */
inline def FormHelperText: js.Function1[/* props */ DefaultComponentPropsFormHelperTextTypeM, Element] = ^.asInstanceOf[js.Dynamic].selectDynamic("FormHelperText").asInstanceOf[js.Function1[/* props */ DefaultComponentPropsFormHelperTextTypeM, Element]]

/**
  *
  * Demos:
  *
  * - [Checkbox](https://mui.com/material-ui/react-checkbox/)
  * - [Radio Group](https://mui.com/material-ui/react-radio-button/)
  * - [Switch](https://mui.com/material-ui/react-switch/)
  *
  * API:
  *
  * - [FormLabel API](https://mui.com/material-ui/api/form-label/)
  */
inline def FormLabel: js.Function1[/* props */ DefaultComponentPropsFormLabelTypeMaplab, Element] = ^.asInstanceOf[js.Dynamic].selectDynamic("FormLabel").asInstanceOf[js.Function1[/* props */ DefaultComponentPropsFormLabelTypeMaplab, Element]]

inline def GlobalStyles(props: GlobalStylesProps): japgolly.scalajs.react.facade.React.Element = ^.asInstanceOf[js.Dynamic].applyDynamic("GlobalStyles")(props.asInstanceOf[js.Any]).asInstanceOf[japgolly.scalajs.react.facade.React.Element]

/**
  *
  * Demos:
  *
  * - [Grid](https://mui.com/material-ui/react-grid/)
  *
  * API:
  *
  * - [Grid API](https://mui.com/material-ui/api/grid/)
  */
inline def Grid: js.Function1[/* props */ DefaultComponentPropsGridTypeMapdiv, Element] = ^.asInstanceOf[js.Dynamic].selectDynamic("Grid").asInstanceOf[js.Function1[/* props */ DefaultComponentPropsGridTypeMapdiv, Element]]

inline def Grow(props: GrowProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Grow")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

/**
  * Responsively hides children based on the selected implementation.
  *
  * Demos:
  *
  * - [Hidden](https://mui.com/material-ui/react-hidden/)
  *
  * API:
  *
  * - [Hidden API](https://mui.com/material-ui/api/hidden/)
  */
inline def Hidden: JSXElementConstructor[HiddenProps] = ^.asInstanceOf[js.Dynamic].selectDynamic("Hidden").asInstanceOf[JSXElementConstructor[HiddenProps]]

/**
  * Refer to the [Icons](https://mui.com/material-ui/icons/) section of the documentation
  * regarding the available icon options.
  *
  * Demos:
  *
  * - [Button](https://mui.com/material-ui/react-button/)
  *
  * API:
  *
  * - [IconButton API](https://mui.com/material-ui/api/icon-button/)
  * - inherits [ButtonBase API](https://mui.com/material-ui/api/button-base/)
  */
inline def IconButton: js.Function1[
/* props */ OverridePropsExtendButtonBaseTypeMapIcon | DefaultComponentPropsExtendButtonBaseTypAriaautocomplete, 
japgolly.scalajs.react.facade.React.Element | Null] = ^.asInstanceOf[js.Dynamic].selectDynamic("IconButton").asInstanceOf[js.Function1[
/* props */ OverridePropsExtendButtonBaseTypeMapIcon | DefaultComponentPropsExtendButtonBaseTypAriaautocomplete, 
japgolly.scalajs.react.facade.React.Element | Null]]

/**
  *
  * Demos:
  *
  * - [Image List](https://mui.com/material-ui/react-image-list/)
  *
  * API:
  *
  * - [ImageList API](https://mui.com/material-ui/api/image-list/)
  */
inline def ImageList: js.Function1[/* props */ DefaultComponentPropsImageListTypeMapul, Element] = ^.asInstanceOf[js.Dynamic].selectDynamic("ImageList").asInstanceOf[js.Function1[/* props */ DefaultComponentPropsImageListTypeMapul, Element]]

/**
  *
  * Demos:
  *
  * - [Image List](https://mui.com/material-ui/react-image-list/)
  *
  * API:
  *
  * - [ImageListItem API](https://mui.com/material-ui/api/image-list-item/)
  */
inline def ImageListItem: js.Function1[/* props */ DefaultComponentPropsImageListItemTypeMa, Element] = ^.asInstanceOf[js.Dynamic].selectDynamic("ImageListItem").asInstanceOf[js.Function1[/* props */ DefaultComponentPropsImageListItemTypeMa, Element]]

inline def ImageListItemBar(props: ImageListItemBarProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ImageListItemBar")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

/**
  *
  * Demos:
  *
  * - [Text Field](https://mui.com/material-ui/react-text-field/)
  *
  * API:
  *
  * - [InputAdornment API](https://mui.com/material-ui/api/input-adornment/)
  */
inline def InputAdornment: js.Function1[/* props */ DefaultComponentPropsInputAdornmentTypeM, Element] = ^.asInstanceOf[js.Dynamic].selectDynamic("InputAdornment").asInstanceOf[js.Function1[/* props */ DefaultComponentPropsInputAdornmentTypeM, Element]]

inline def InputBase(props: InputBaseProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InputBase")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

/**
  *
  * Demos:
  *
  * - [Text Field](https://mui.com/material-ui/react-text-field/)
  *
  * API:
  *
  * - [InputLabel API](https://mui.com/material-ui/api/input-label/)
  * - inherits [FormLabel API](https://mui.com/material-ui/api/form-label/)
  */
inline def InputLabel: js.Function1[/* props */ DefaultComponentPropsInputLabelTypeMapla, Element] = ^.asInstanceOf[js.Dynamic].selectDynamic("InputLabel").asInstanceOf[js.Function1[/* props */ DefaultComponentPropsInputLabelTypeMapla, Element]]

inline def LinearProgress(props: LinearProgressProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("LinearProgress")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

/**
  *
  * Demos:
  *
  * - [Breadcrumbs](https://mui.com/material-ui/react-breadcrumbs/)
  * - [Links](https://mui.com/material-ui/react-link/)
  *
  * API:
  *
  * - [Link API](https://mui.com/material-ui/api/link/)
  * - inherits [Typography API](https://mui.com/material-ui/api/typography/)
  */
inline def Link: js.Function1[/* props */ DefaultComponentPropsLinkTypeMapa, Element] = ^.asInstanceOf[js.Dynamic].selectDynamic("Link").asInstanceOf[js.Function1[/* props */ DefaultComponentPropsLinkTypeMapa, Element]]

/**
  *
  * Demos:
  *
  * - [Lists](https://mui.com/material-ui/react-list/)
  * - [Transfer List](https://mui.com/material-ui/react-transfer-list/)
  *
  * API:
  *
  * - [List API](https://mui.com/material-ui/api/list/)
  */
inline def List: js.Function1[/* props */ DefaultComponentPropsExtendListTypeMapLi, Element] = ^.asInstanceOf[js.Dynamic].selectDynamic("List").asInstanceOf[js.Function1[/* props */ DefaultComponentPropsExtendListTypeMapLi, Element]]

/**
  * Uses an additional container component if `ListItemSecondaryAction` is the last child.
  *
  * Demos:
  *
  * - [Lists](https://mui.com/material-ui/react-list/)
  * - [Transfer List](https://mui.com/material-ui/react-transfer-list/)
  *
  * API:
  *
  * - [ListItem API](https://mui.com/material-ui/api/list-item/)
  */
inline def ListItem: (js.Function1[
/* props */ OverridePropsExtendButtonBaseTypeMapList | DefaultComponentPropsExtendButtonBaseTypAlignItems, 
japgolly.scalajs.react.facade.React.Element | Null]) & (js.Function1[/* props */ DefaultComponentPropsListItemTypeMapli, Element]) = ^.asInstanceOf[js.Dynamic].selectDynamic("ListItem").asInstanceOf[(js.Function1[
/* props */ OverridePropsExtendButtonBaseTypeMapList | DefaultComponentPropsExtendButtonBaseTypAlignItems, 
japgolly.scalajs.react.facade.React.Element | Null]) & (js.Function1[/* props */ DefaultComponentPropsListItemTypeMapli, Element])]

inline def ListItemAvatar(props: ListItemAvatarProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ListItemAvatar")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

/**
  *
  * Demos:
  *
  * - [Lists](https://mui.com/material-ui/react-list/)
  *
  * API:
  *
  * - [ListItemButton API](https://mui.com/material-ui/api/list-item-button/)
  * - inherits [ButtonBase API](https://mui.com/material-ui/api/button-base/)
  */
inline def ListItemButton: js.Function1[
/* props */ OverridePropsExtendButtonBaseTypeMapListAbout | DefaultComponentPropsExtendButtonBaseTypAriabusy, 
japgolly.scalajs.react.facade.React.Element | Null] = ^.asInstanceOf[js.Dynamic].selectDynamic("ListItemButton").asInstanceOf[js.Function1[
/* props */ OverridePropsExtendButtonBaseTypeMapListAbout | DefaultComponentPropsExtendButtonBaseTypAriabusy, 
japgolly.scalajs.react.facade.React.Element | Null]]

inline def ListItemIcon(props: ListItemIconProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ListItemIcon")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

inline def ListItemText[PrimaryTypographyComponent /* <: ElementType */, SecondaryTypographyComponent /* <: ElementType */](props: ListItemTextProps[PrimaryTypographyComponent, SecondaryTypographyComponent]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ListItemText")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

/**
  *
  * Demos:
  *
  * - [Lists](https://mui.com/material-ui/react-list/)
  *
  * API:
  *
  * - [ListSubheader API](https://mui.com/material-ui/api/list-subheader/)
  */
inline def ListSubheader: js.Function1[/* props */ DefaultComponentPropsListSubheaderTypeMa, Element] = ^.asInstanceOf[js.Dynamic].selectDynamic("ListSubheader").asInstanceOf[js.Function1[/* props */ DefaultComponentPropsListSubheaderTypeMa, Element]]

inline def Menu(props: MenuProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Menu")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

/**
  *
  * Demos:
  *
  * - [Menu](https://mui.com/material-ui/react-menu/)
  *
  * API:
  *
  * - [MenuItem API](https://mui.com/material-ui/api/menu-item/)
  * - inherits [ButtonBase API](https://mui.com/material-ui/api/button-base/)
  */
inline def MenuItem: js.Function1[
/* props */ OverridePropsExtendButtonBaseTypeMapMenu | DefaultComponentPropsExtendButtonBaseTypAriachecked, 
japgolly.scalajs.react.facade.React.Element | Null] = ^.asInstanceOf[js.Dynamic].selectDynamic("MenuItem").asInstanceOf[js.Function1[
/* props */ OverridePropsExtendButtonBaseTypeMapMenu | DefaultComponentPropsExtendButtonBaseTypAriachecked, 
japgolly.scalajs.react.facade.React.Element | Null]]

/**
  * A permanently displayed menu following https://www.w3.org/WAI/ARIA/apg/patterns/menu-button/.
  * It's exposed to help customization of the [`Menu`](https://mui.com/material-ui/api/menu/) component if you
  * use it separately you need to move focus into the component manually. Once
  * the focus is placed inside the component it is fully keyboard accessible.
  *
  * Demos:
  *
  * - [Menu](https://mui.com/material-ui/react-menu/)
  *
  * API:
  *
  * - [MenuList API](https://mui.com/material-ui/api/menu-list/)
  * - inherits [List API](https://mui.com/material-ui/api/list/)
  */
inline def MenuList: js.Function1[/* props */ DefaultComponentPropsExtendListTypeMapMe, Element] = ^.asInstanceOf[js.Dynamic].selectDynamic("MenuList").asInstanceOf[js.Function1[/* props */ DefaultComponentPropsExtendListTypeMapMe, Element]]

inline def MobileStepper(props: MobileStepperProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("MobileStepper")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

/**
  * Modal is a lower-level construct that is leveraged by the following components:
  *
  * *   [Dialog](https://mui.com/material-ui/api/dialog/)
  * *   [Drawer](https://mui.com/material-ui/api/drawer/)
  * *   [Menu](https://mui.com/material-ui/api/menu/)
  * *   [Popover](https://mui.com/material-ui/api/popover/)
  *
  * If you are creating a modal dialog, you probably want to use the [Dialog](https://mui.com/material-ui/api/dialog/) component
  * rather than directly using Modal.
  *
  * This component shares many concepts with [react-overlays](https://react-bootstrap.github.io/react-overlays/#modals).
  *
  * Demos:
  *
  * - [Modal](https://mui.com/material-ui/react-modal/)
  *
  * API:
  *
  * - [Modal API](https://mui.com/material-ui/api/modal/)
  */
inline def Modal: js.Function1[/* props */ DefaultComponentPropsModalTypeMapdiv, Element] = ^.asInstanceOf[js.Dynamic].selectDynamic("Modal").asInstanceOf[js.Function1[/* props */ DefaultComponentPropsModalTypeMapdiv, Element]]

inline def ModalRoot: FC[ModalRootProps] = ^.asInstanceOf[js.Dynamic].selectDynamic("ModalRoot").asInstanceOf[FC[ModalRootProps]]

inline def Pagination(props: PaginationProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Pagination")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

/**
  *
  * Demos:
  *
  * - [Pagination](https://mui.com/material-ui/react-pagination/)
  *
  * API:
  *
  * - [PaginationItem API](https://mui.com/material-ui/api/pagination-item/)
  */
inline def PaginationItem: js.Function1[/* props */ DefaultComponentPropsPaginationItemTypeM, Element] = ^.asInstanceOf[js.Dynamic].selectDynamic("PaginationItem").asInstanceOf[js.Function1[/* props */ DefaultComponentPropsPaginationItemTypeM, Element]]

/**
  *
  * Demos:
  *
  * - [Card](https://mui.com/material-ui/react-card/)
  * - [Paper](https://mui.com/material-ui/react-paper/)
  *
  * API:
  *
  * - [Paper API](https://mui.com/material-ui/api/paper/)
  */
inline def Paper: js.Function1[/* props */ DefaultComponentPropsPaperTypeMapdiv, Element] = ^.asInstanceOf[js.Dynamic].selectDynamic("Paper").asInstanceOf[js.Function1[/* props */ DefaultComponentPropsPaperTypeMapdiv, Element]]

inline def Popover(props: PopoverProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Popover")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

/**
  *
  * Demos:
  *
  * - [Autocomplete](https://mui.com/material-ui/react-autocomplete/)
  * - [Menu](https://mui.com/material-ui/react-menu/)
  * - [Popper](https://mui.com/material-ui/react-popper/)
  *
  * API:
  *
  * - [Popper API](https://mui.com/material-ui/api/popper/)
  */
inline def Popper: ForwardRefExoticComponent[OmitPopperUnstyledPropsdivdirectionRefAt] = ^.asInstanceOf[js.Dynamic].selectDynamic("Popper").asInstanceOf[ForwardRefExoticComponent[OmitPopperUnstyledPropsdivdirectionRefAt]]

/**
  * Portals provide a first-class way to render children into a DOM node
  * that exists outside the DOM hierarchy of the parent component.
  *
  * Demos:
  *
  * - [Portal](https://mui.com/base/react-portal/)
  *
  * API:
  *
  * - [Portal API](https://mui.com/base/react-portal/components-api/#portal)
  */
inline def Portal: ForwardRefExoticComponent[PortalProps & RefAttributes[org.scalajs.dom.Element]] = ^.asInstanceOf[js.Dynamic].selectDynamic("Portal").asInstanceOf[ForwardRefExoticComponent[PortalProps & RefAttributes[org.scalajs.dom.Element]]]

inline def Radio(props: RadioProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Radio")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

inline def RadioGroup(props: RadioGroupProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("RadioGroup")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

inline def Rating(props: RatingProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Rating")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

/**
  *
  * Demos:
  *
  * - [CSS Baseline](https://mui.com/material-ui/react-css-baseline/)
  *
  * API:
  *
  * - [ScopedCssBaseline API](https://mui.com/material-ui/api/scoped-css-baseline/)
  */
inline def ScopedCssBaseline: js.Function1[/* props */ DefaultComponentPropsScopedCssBaselineTy, Element] = ^.asInstanceOf[js.Dynamic].selectDynamic("ScopedCssBaseline").asInstanceOf[js.Function1[/* props */ DefaultComponentPropsScopedCssBaselineTy, Element]]

/**
  *
  * Demos:
  *
  * - [Skeleton](https://mui.com/material-ui/react-skeleton/)
  *
  * API:
  *
  * - [Skeleton API](https://mui.com/material-ui/api/skeleton/)
  */
inline def Skeleton: js.Function1[/* props */ DefaultComponentPropsSkeletonTypeMapspan, Element] = ^.asInstanceOf[js.Dynamic].selectDynamic("Skeleton").asInstanceOf[js.Function1[/* props */ DefaultComponentPropsSkeletonTypeMapspan, Element]]

inline def Slide(props: SlideProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Slide")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

/**
  *
  * Demos:
  *
  * - [Slider](https://mui.com/material-ui/react-slider/)
  *
  * API:
  *
  * - [Slider API](https://mui.com/material-ui/api/slider/)
  */
inline def Slider: js.Function1[/* props */ DefaultComponentPropsSliderTypeMapspan, Element] = ^.asInstanceOf[js.Dynamic].selectDynamic("Slider").asInstanceOf[js.Function1[/* props */ DefaultComponentPropsSliderTypeMapspan, Element]]

inline def SliderMark: FC[SliderMarkProps] = ^.asInstanceOf[js.Dynamic].selectDynamic("SliderMark").asInstanceOf[FC[SliderMarkProps]]

inline def SliderMarkLabel: FC[SliderMarkLabelProps] = ^.asInstanceOf[js.Dynamic].selectDynamic("SliderMarkLabel").asInstanceOf[FC[SliderMarkLabelProps]]

inline def SliderRail: FC[SliderRailProps] = ^.asInstanceOf[js.Dynamic].selectDynamic("SliderRail").asInstanceOf[FC[SliderRailProps]]

inline def SliderRoot: FC[SliderRootProps] = ^.asInstanceOf[js.Dynamic].selectDynamic("SliderRoot").asInstanceOf[FC[SliderRootProps]]

inline def SliderThumb: FC[SliderThumbProps] = ^.asInstanceOf[js.Dynamic].selectDynamic("SliderThumb").asInstanceOf[FC[SliderThumbProps]]

inline def SliderTrack: FC[SliderTrackProps] = ^.asInstanceOf[js.Dynamic].selectDynamic("SliderTrack").asInstanceOf[FC[SliderTrackProps]]

inline def SliderValueLabel: FC[SliderValueLabelProps] = ^.asInstanceOf[js.Dynamic].selectDynamic("SliderValueLabel").asInstanceOf[FC[SliderValueLabelProps]]

inline def Snackbar(props: SnackbarProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Snackbar")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

inline def SnackbarContent(props: SnackbarContentProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SnackbarContent")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

inline def SpeedDial(props: SpeedDialProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SpeedDial")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

inline def SpeedDialAction(props: SpeedDialActionProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SpeedDialAction")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

/**
  *
  * Demos:
  *
  * - [Stack](https://mui.com/material-ui/react-stack/)
  *
  * API:
  *
  * - [Stack API](https://mui.com/material-ui/api/stack/)
  */
inline def Stack: js.Function1[/* props */ DefaultComponentPropsStackTypeMapdiv, Element] = ^.asInstanceOf[js.Dynamic].selectDynamic("Stack").asInstanceOf[js.Function1[/* props */ DefaultComponentPropsStackTypeMapdiv, Element]]

/**
  *
  * Demos:
  *
  * - [Stepper](https://mui.com/material-ui/react-stepper/)
  *
  * API:
  *
  * - [Step API](https://mui.com/material-ui/api/step/)
  */
inline def Step: js.Function1[/* props */ DefaultComponentPropsStepTypeMapdiv, Element] = ^.asInstanceOf[js.Dynamic].selectDynamic("Step").asInstanceOf[js.Function1[/* props */ DefaultComponentPropsStepTypeMapdiv, Element]]

/**
  *
  * Demos:
  *
  * - [Stepper](https://mui.com/material-ui/react-stepper/)
  *
  * API:
  *
  * - [StepButton API](https://mui.com/material-ui/api/step-button/)
  * - inherits [ButtonBase API](https://mui.com/material-ui/api/button-base/)
  */
inline def StepButton: js.Function1[
/* props */ OverridePropsExtendButtonBaseTypeMapStep | DefaultComponentPropsExtendButtonBaseTypAriacolcount, 
japgolly.scalajs.react.facade.React.Element | Null] = ^.asInstanceOf[js.Dynamic].selectDynamic("StepButton").asInstanceOf[js.Function1[
/* props */ OverridePropsExtendButtonBaseTypeMapStep | DefaultComponentPropsExtendButtonBaseTypAriacolcount, 
japgolly.scalajs.react.facade.React.Element | Null]]

inline def StepConnector(props: StepConnectorProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("StepConnector")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

inline def StepContent(props: StepContentProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("StepContent")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

/**
  * Provides information about the current step in Stepper.
  */
inline def StepContext: Context[js.Object | StepContextType] = ^.asInstanceOf[js.Dynamic].selectDynamic("StepContext").asInstanceOf[Context[js.Object | StepContextType]]

inline def StepIcon(props: StepIconProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("StepIcon")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

/**
  *
  * Demos:
  *
  * - [Stepper](https://mui.com/material-ui/react-stepper/)
  *
  * API:
  *
  * - [Stepper API](https://mui.com/material-ui/api/stepper/)
  */
inline def Stepper: js.Function1[/* props */ DefaultComponentPropsStepperTypeMapdiv, Element] = ^.asInstanceOf[js.Dynamic].selectDynamic("Stepper").asInstanceOf[js.Function1[/* props */ DefaultComponentPropsStepperTypeMapdiv, Element]]

/**
  * Provides information about the current step in Stepper.
  */
inline def StepperContext: Context[js.Object | StepperContextType] = ^.asInstanceOf[js.Dynamic].selectDynamic("StepperContext").asInstanceOf[Context[js.Object | StepperContextType]]

inline def StyledEngineProvider(props: StyledEngineProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("StyledEngineProvider")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

/**
  *
  * Demos:
  *
  * - [Drawer](https://mui.com/material-ui/react-drawer/)
  *
  * API:
  *
  * - [SwipeableDrawer API](https://mui.com/material-ui/api/swipeable-drawer/)
  * - inherits [Drawer API](https://mui.com/material-ui/api/drawer/)
  */
inline def SwipeableDrawer: JSXElementConstructor[SwipeableDrawerProps] = ^.asInstanceOf[js.Dynamic].selectDynamic("SwipeableDrawer").asInstanceOf[JSXElementConstructor[SwipeableDrawerProps]]

inline def Switch(props: SwitchProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Switch")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

/**
  *
  * Demos:
  *
  * - [Tabs](https://mui.com/material-ui/react-tabs/)
  *
  * API:
  *
  * - [Tab API](https://mui.com/material-ui/api/tab/)
  * - inherits [ButtonBase API](https://mui.com/material-ui/api/button-base/)
  */
inline def Tab: js.Function1[
/* props */ OverridePropsExtendButtonBaseTypeMapTabT | DefaultComponentPropsExtendButtonBaseTypAriacolindex, 
japgolly.scalajs.react.facade.React.Element | Null] = ^.asInstanceOf[js.Dynamic].selectDynamic("Tab").asInstanceOf[js.Function1[
/* props */ OverridePropsExtendButtonBaseTypeMapTabT | DefaultComponentPropsExtendButtonBaseTypAriacolindex, 
japgolly.scalajs.react.facade.React.Element | Null]]

inline def TabScrollButton(props: TabScrollButtonProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("TabScrollButton")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

/**
  *
  * Demos:
  *
  * - [Table](https://mui.com/material-ui/react-table/)
  *
  * API:
  *
  * - [Table API](https://mui.com/material-ui/api/table/)
  */
inline def Table: js.Function1[/* props */ DefaultComponentPropsTableTypeMaptable, Element] = ^.asInstanceOf[js.Dynamic].selectDynamic("Table").asInstanceOf[js.Function1[/* props */ DefaultComponentPropsTableTypeMaptable, Element]]

/**
  *
  * Demos:
  *
  * - [Table](https://mui.com/material-ui/react-table/)
  *
  * API:
  *
  * - [TableBody API](https://mui.com/material-ui/api/table-body/)
  */
inline def TableBody: js.Function1[/* props */ DefaultComponentPropsTableBodyTypeMaptbo, Element] = ^.asInstanceOf[js.Dynamic].selectDynamic("TableBody").asInstanceOf[js.Function1[/* props */ DefaultComponentPropsTableBodyTypeMaptbo, Element]]

inline def TableCell(props: TableCellProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("TableCell")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

/**
  *
  * Demos:
  *
  * - [Table](https://mui.com/material-ui/react-table/)
  *
  * API:
  *
  * - [TableContainer API](https://mui.com/material-ui/api/table-container/)
  */
inline def TableContainer: js.Function1[/* props */ DefaultComponentPropsTableContainerTypeM, Element] = ^.asInstanceOf[js.Dynamic].selectDynamic("TableContainer").asInstanceOf[js.Function1[/* props */ DefaultComponentPropsTableContainerTypeM, Element]]

/**
  *
  * Demos:
  *
  * - [Table](https://mui.com/material-ui/react-table/)
  *
  * API:
  *
  * - [TableFooter API](https://mui.com/material-ui/api/table-footer/)
  */
inline def TableFooter: js.Function1[/* props */ DefaultComponentPropsTableFooterTypeMapt, Element] = ^.asInstanceOf[js.Dynamic].selectDynamic("TableFooter").asInstanceOf[js.Function1[/* props */ DefaultComponentPropsTableFooterTypeMapt, Element]]

/**
  *
  * Demos:
  *
  * - [Table](https://mui.com/material-ui/react-table/)
  *
  * API:
  *
  * - [TableHead API](https://mui.com/material-ui/api/table-head/)
  */
inline def TableHead: js.Function1[/* props */ DefaultComponentPropsTableHeadTypeMapthe, Element] = ^.asInstanceOf[js.Dynamic].selectDynamic("TableHead").asInstanceOf[js.Function1[/* props */ DefaultComponentPropsTableHeadTypeMapthe, Element]]

/**
  * A `TableCell` based component for placing inside `TableFooter` for pagination.
  *
  * Demos:
  *
  * - [Table](https://mui.com/material-ui/react-table/)
  *
  * API:
  *
  * - [TablePagination API](https://mui.com/material-ui/api/table-pagination/)
  * - inherits [TableCell API](https://mui.com/material-ui/api/table-cell/)
  */
inline def TablePagination: js.Function1[/* props */ DefaultComponentPropsTablePaginationType, Element] = ^.asInstanceOf[js.Dynamic].selectDynamic("TablePagination").asInstanceOf[js.Function1[/* props */ DefaultComponentPropsTablePaginationType, Element]]

/**
  * Will automatically set dynamic row height
  * based on the material table element parent (head, body, etc).
  *
  * Demos:
  *
  * - [Table](https://mui.com/material-ui/react-table/)
  *
  * API:
  *
  * - [TableRow API](https://mui.com/material-ui/api/table-row/)
  */
inline def TableRow: js.Function1[/* props */ DefaultComponentPropsTableRowTypeMaptr, Element] = ^.asInstanceOf[js.Dynamic].selectDynamic("TableRow").asInstanceOf[js.Function1[/* props */ DefaultComponentPropsTableRowTypeMaptr, Element]]

/**
  * A button based label for placing inside `TableCell` for column sorting.
  *
  * Demos:
  *
  * - [Table](https://mui.com/material-ui/react-table/)
  *
  * API:
  *
  * - [TableSortLabel API](https://mui.com/material-ui/api/table-sort-label/)
  * - inherits [ButtonBase API](https://mui.com/material-ui/api/button-base/)
  */
inline def TableSortLabel: js.Function1[
/* props */ OverridePropsExtendButtonBaseTypeMapTabl | DefaultComponentPropsExtendButtonBaseTypActive, 
japgolly.scalajs.react.facade.React.Element | Null] = ^.asInstanceOf[js.Dynamic].selectDynamic("TableSortLabel").asInstanceOf[js.Function1[
/* props */ OverridePropsExtendButtonBaseTypeMapTabl | DefaultComponentPropsExtendButtonBaseTypActive, 
japgolly.scalajs.react.facade.React.Element | Null]]

/**
  *
  * Demos:
  *
  * - [Tabs](https://mui.com/material-ui/react-tabs/)
  *
  * API:
  *
  * - [Tabs API](https://mui.com/material-ui/api/tabs/)
  */
inline def Tabs: js.Function1[/* props */ DefaultComponentPropsTabsTypeMappropsOve, Element] = ^.asInstanceOf[js.Dynamic].selectDynamic("Tabs").asInstanceOf[js.Function1[/* props */ DefaultComponentPropsTabsTypeMappropsOve, Element]]

inline def TextField(props: TextFieldProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("TextField")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

/**
  *
  * Demos:
  *
  * - [Textarea Autosize](https://mui.com/base/react-textarea-autosize/)
  * - [Textarea Autosize](https://mui.com/material-ui/react-textarea-autosize/)
  *
  * API:
  *
  * - [TextareaAutosize API](https://mui.com/base/react-textarea-autosize/components-api/#textarea-autosize)
  */
inline def TextareaAutosize: ForwardRefExoticComponent[PickTextareaAutosizePropshiddencolorstyl] = ^.asInstanceOf[js.Dynamic].selectDynamic("TextareaAutosize").asInstanceOf[ForwardRefExoticComponent[PickTextareaAutosizePropshiddencolorstyl]]

inline def ThemeProvider[T](props: ThemeProviderProps[T]): japgolly.scalajs.react.facade.React.Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ThemeProvider")(props.asInstanceOf[js.Any]).asInstanceOf[japgolly.scalajs.react.facade.React.Element]

/**
  *
  * Demos:
  *
  * - [Toggle Button](https://mui.com/material-ui/react-toggle-button/)
  *
  * API:
  *
  * - [ToggleButton API](https://mui.com/material-ui/api/toggle-button/)
  * - inherits [ButtonBase API](https://mui.com/material-ui/api/button-base/)
  */
inline def ToggleButton: js.Function1[
/* props */ OverridePropsExtendButtonBaseTypeMapTogg | DefaultComponentPropsExtendButtonBaseTypAriacolspan, 
japgolly.scalajs.react.facade.React.Element | Null] = ^.asInstanceOf[js.Dynamic].selectDynamic("ToggleButton").asInstanceOf[js.Function1[
/* props */ OverridePropsExtendButtonBaseTypeMapTogg | DefaultComponentPropsExtendButtonBaseTypAriacolspan, 
japgolly.scalajs.react.facade.React.Element | Null]]

inline def ToggleButtonGroup(props: ToggleButtonGroupProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ToggleButtonGroup")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

/**
  *
  * Demos:
  *
  * - [App Bar](https://mui.com/material-ui/react-app-bar/)
  *
  * API:
  *
  * - [Toolbar API](https://mui.com/material-ui/api/toolbar/)
  */
inline def Toolbar: js.Function1[/* props */ DefaultComponentPropsToolbarTypeMapdiv, Element] = ^.asInstanceOf[js.Dynamic].selectDynamic("Toolbar").asInstanceOf[js.Function1[/* props */ DefaultComponentPropsToolbarTypeMapdiv, Element]]

inline def Tooltip(props: TooltipProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Tooltip")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

/**
  *
  * Demos:
  *
  * - [Breadcrumbs](https://mui.com/material-ui/react-breadcrumbs/)
  * - [Typography](https://mui.com/material-ui/react-typography/)
  *
  * API:
  *
  * - [Typography API](https://mui.com/material-ui/api/typography/)
  */
inline def Typography: js.Function1[/* props */ DefaultComponentPropsTypographyTypeMapsp, Element] = ^.asInstanceOf[js.Dynamic].selectDynamic("Typography").asInstanceOf[js.Function1[/* props */ DefaultComponentPropsTypographyTypeMapsp, Element]]

inline def UnstableGrid2: js.Function1[/* props */ DefaultComponentPropsGrid2TypeMapdiv, Element | Null] = ^.asInstanceOf[js.Dynamic].selectDynamic("Unstable_Grid2").asInstanceOf[js.Function1[/* props */ DefaultComponentPropsGrid2TypeMapdiv, Element | Null]]

inline def Zoom(props: ZoomProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Zoom")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

inline def accordionActionsClasses: AccordionActionsClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("accordionActionsClasses").asInstanceOf[AccordionActionsClasses]

inline def accordionClasses: AccordionClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("accordionClasses").asInstanceOf[AccordionClasses]

inline def accordionDetailsClasses: AccordionDetailsClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("accordionDetailsClasses").asInstanceOf[AccordionDetailsClasses]

inline def accordionSummaryClasses: AccordionSummaryClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("accordionSummaryClasses").asInstanceOf[AccordionSummaryClasses]

inline def adaptV4Theme(): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("adaptV4Theme")().asInstanceOf[Theme]
inline def adaptV4Theme(options: DeprecatedThemeOptions): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("adaptV4Theme")(options.asInstanceOf[js.Any]).asInstanceOf[Theme]

inline def alertClasses: AlertClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("alertClasses").asInstanceOf[AlertClasses]

inline def alertTitleClasses: AlertTitleClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("alertTitleClasses").asInstanceOf[AlertTitleClasses]

inline def alpha(color: String, value: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("alpha")(color.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]

inline def appBarClasses: AppBarClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("appBarClasses").asInstanceOf[AppBarClasses]

inline def ariaHidden(element: org.scalajs.dom.Element, show: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ariaHidden")(element.asInstanceOf[js.Any], show.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def autocompleteClasses: AutocompleteClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("autocompleteClasses").asInstanceOf[AutocompleteClasses]

inline def avatarClasses: AvatarClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("avatarClasses").asInstanceOf[AvatarClasses]

inline def avatarGroupClasses: AvatarGroupClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("avatarGroupClasses").asInstanceOf[AvatarGroupClasses]

inline def backdropClasses: BackdropClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("backdropClasses").asInstanceOf[BackdropClasses]

inline def badgeClasses: BadgeClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("badgeClasses").asInstanceOf[BadgeClasses]

inline def bottomNavigationActionClasses: BottomNavigationActionClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("bottomNavigationActionClasses").asInstanceOf[BottomNavigationActionClasses]

inline def bottomNavigationClasses: BottomNavigationClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("bottomNavigationClasses").asInstanceOf[BottomNavigationClasses]

inline def breadcrumbsClasses: BreadcrumbsClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("breadcrumbsClasses").asInstanceOf[BreadcrumbsClasses]

inline def buttonBaseClasses: ButtonBaseClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("buttonBaseClasses").asInstanceOf[ButtonBaseClasses]

inline def buttonClasses: ButtonClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("buttonClasses").asInstanceOf[ButtonClasses]

inline def buttonGroupClasses: ButtonGroupClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("buttonGroupClasses").asInstanceOf[ButtonGroupClasses]

inline def capitalize(string: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("capitalize")(string.asInstanceOf[js.Any]).asInstanceOf[String]

inline def cardActionAreaClasses: CardActionAreaClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("cardActionAreaClasses").asInstanceOf[CardActionAreaClasses]

inline def cardActionsClasses: CardActionsClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("cardActionsClasses").asInstanceOf[CardActionsClasses]

inline def cardClasses: CardClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("cardClasses").asInstanceOf[CardClasses]

inline def cardContentClasses: CardContentClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("cardContentClasses").asInstanceOf[CardContentClasses]

inline def cardHeaderClasses: CardHeaderClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("cardHeaderClasses").asInstanceOf[CardHeaderClasses]

inline def cardMediaClasses: CardMediaClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("cardMediaClasses").asInstanceOf[CardMediaClasses]

inline def checkboxClasses: CheckboxClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("checkboxClasses").asInstanceOf[CheckboxClasses]

inline def chipClasses: ChipClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("chipClasses").asInstanceOf[ChipClasses]

inline def circularProgressClasses: CircularProgressClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("circularProgressClasses").asInstanceOf[CircularProgressClasses]

inline def collapseClasses: CollapseClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("collapseClasses").asInstanceOf[CollapseClasses]

inline def containerClasses: ContainerClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("containerClasses").asInstanceOf[ContainerClasses]

inline def createChainedFunction[Args /* <: js.Array[Any] */, This](funcs: (js.ThisFunction1[/* this */ This, /* args */ Args, Any])*): js.ThisFunction1[/* this */ This, /* args */ Args, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("createChainedFunction")(funcs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.ThisFunction1[/* this */ This, /* args */ Args, Unit]]

inline def createFilterOptions[T](): js.Function2[/* options */ js.Array[T], /* state */ FilterOptionsState[T], js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFilterOptions")().asInstanceOf[js.Function2[/* options */ js.Array[T], /* state */ FilterOptionsState[T], js.Array[T]]]
inline def createFilterOptions[T](config: CreateFilterOptionsConfig[T]): js.Function2[/* options */ js.Array[T], /* state */ FilterOptionsState[T], js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFilterOptions")(config.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* options */ js.Array[T], /* state */ FilterOptionsState[T], js.Array[T]]]

inline def createMuiTheme(options: ThemeOptions, args: js.Object*): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("createMuiTheme")(scala.List(options.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Theme]
inline def createMuiTheme(options: Unit, args: js.Object*): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("createMuiTheme")(scala.List(options.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Theme]

inline def createStyles(styles: Any): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("createStyles")(styles.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]

inline def createSvgIcon(path: Node, displayName: String): OverridableComponentSvgIconTypeMapsvg = (^.asInstanceOf[js.Dynamic].applyDynamic("createSvgIcon")(path.asInstanceOf[js.Any], displayName.asInstanceOf[js.Any])).asInstanceOf[OverridableComponentSvgIconTypeMapsvg]

inline def createTheme(options: ThemeOptions, args: js.Object*): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("createTheme")(scala.List(options.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Theme]
inline def createTheme(options: Unit, args: js.Object*): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("createTheme")(scala.List(options.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Theme]

inline def css(args: CSSInterpolation*): SerializedStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("css")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[SerializedStyles]
inline def css(template: TemplateStringsArray, args: CSSInterpolation*): SerializedStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("css")(scala.List(template.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[SerializedStyles]

inline def darkScrollbar(): ScrollbarColor = ^.asInstanceOf[js.Dynamic].applyDynamic("darkScrollbar")().asInstanceOf[ScrollbarColor]
inline def darkScrollbar(options: Thumb): ScrollbarColor = ^.asInstanceOf[js.Dynamic].applyDynamic("darkScrollbar")(options.asInstanceOf[js.Any]).asInstanceOf[ScrollbarColor]

inline def darken(color: String, coefficient: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("darken")(color.asInstanceOf[js.Any], coefficient.asInstanceOf[js.Any])).asInstanceOf[String]

inline def debounce[T /* <: js.Function1[/* repeated */ Any, Any] */](func: T): T & Cancelable = ^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(func.asInstanceOf[js.Any]).asInstanceOf[T & Cancelable]
inline def debounce[T /* <: js.Function1[/* repeated */ Any, Any] */](func: T, wait: Double): T & Cancelable = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(func.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[T & Cancelable]

inline def decomposeColor(color: String): ColorObject = ^.asInstanceOf[js.Dynamic].applyDynamic("decomposeColor")(color.asInstanceOf[js.Any]).asInstanceOf[ColorObject]

inline def deprecatedPropType[T](validator: T, reason: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("deprecatedPropType")(validator.asInstanceOf[js.Any], reason.asInstanceOf[js.Any])).asInstanceOf[T]

inline def dialogActionsClasses: DialogActionsClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("dialogActionsClasses").asInstanceOf[DialogActionsClasses]

inline def dialogClasses: DialogClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("dialogClasses").asInstanceOf[DialogClasses]

inline def dialogContentClasses: DialogContentClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("dialogContentClasses").asInstanceOf[DialogContentClasses]

inline def dialogContentTextClasses: DialogContentTextClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("dialogContentTextClasses").asInstanceOf[DialogContentTextClasses]

inline def dialogTitleClasses: DialogTitleClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("dialogTitleClasses").asInstanceOf[DialogTitleClasses]

inline def dividerClasses: DividerClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("dividerClasses").asInstanceOf[DividerClasses]

inline def drawerClasses: DrawerClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("drawerClasses").asInstanceOf[DrawerClasses]

inline def duration: Duration_ = ^.asInstanceOf[js.Dynamic].selectDynamic("duration").asInstanceOf[Duration_]

inline def easing: Easing_ = ^.asInstanceOf[js.Dynamic].selectDynamic("easing").asInstanceOf[Easing_]

inline def emphasize(color: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("emphasize")(color.asInstanceOf[js.Any]).asInstanceOf[String]
inline def emphasize(color: String, coefficient: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("emphasize")(color.asInstanceOf[js.Any], coefficient.asInstanceOf[js.Any])).asInstanceOf[String]

inline def experimentalExtendTheme(options: CssVarsThemeOptions, args: js.Object*): OmitThemepaletteCssVarsTheme = ^.asInstanceOf[js.Dynamic].applyDynamic("experimental_extendTheme")(scala.List(options.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[OmitThemepaletteCssVarsTheme]
inline def experimentalExtendTheme(options: Unit, args: js.Object*): OmitThemepaletteCssVarsTheme = ^.asInstanceOf[js.Dynamic].applyDynamic("experimental_extendTheme")(scala.List(options.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[OmitThemepaletteCssVarsTheme]

/**
  * Custom styled utility that has a default MUI theme.
  * @param tag HTML tag or component that should serve as base.
  * @param options Styled options for the created component.
  * @returns React component that has styles attached to it.
  */
inline def experimentalStyled: CreateMUIStyled[Theme] = ^.asInstanceOf[js.Dynamic].selectDynamic("experimentalStyled").asInstanceOf[CreateMUIStyled[Theme]]

inline def experimentalSx(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("experimental_sx")().asInstanceOf[Any]

inline def fabClasses: FabClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("fabClasses").asInstanceOf[FabClasses]

inline def filledInputClasses: FilledInputClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("filledInputClasses").asInstanceOf[FilledInputClasses]

inline def formControlClasses: FormControlClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("formControlClasses").asInstanceOf[FormControlClasses]

inline def formControlLabelClasses: FormControlLabelClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("formControlLabelClasses").asInstanceOf[FormControlLabelClasses]

inline def formGroupClasses: FormGroupClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("formGroupClasses").asInstanceOf[FormGroupClasses]

inline def formHelperTextClasses: FormHelperTextClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("formHelperTextClasses").asInstanceOf[FormHelperTextClasses]

inline def formLabelClasses: FormLabelClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("formLabelClasses").asInstanceOf[FormLabelClasses]

inline def getAccordionActionsUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAccordionActionsUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getAccordionDetailsUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAccordionDetailsUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getAccordionSummaryUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAccordionSummaryUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getAccordionUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAccordionUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getAlertTitleUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAlertTitleUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getAlertUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAlertUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getAppBarUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAppBarUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getAutocompleteUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAutocompleteUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getAvatarGroupUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAvatarGroupUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getAvatarUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAvatarUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getBackdropUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getBackdropUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getBadgeUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getBadgeUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getBottomNavigationActionUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getBottomNavigationActionUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getBottomNavigationUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getBottomNavigationUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getBreadcrumbsUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getBreadcrumbsUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getButtonBaseUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getButtonBaseUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getButtonGroupUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getButtonGroupUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getButtonUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getButtonUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getCardActionAreaUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCardActionAreaUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getCardActionsUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCardActionsUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getCardContentUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCardContentUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getCardHeaderUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCardHeaderUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getCardMediaUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCardMediaUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getCardUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCardUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getCheckboxUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCheckboxUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getChipUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getChipUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getCircularProgressUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCircularProgressUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getCollapseUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCollapseUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getContainerUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getContainerUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getContrastRatio(foreground: String, background: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getContrastRatio")(foreground.asInstanceOf[js.Any], background.asInstanceOf[js.Any])).asInstanceOf[Double]

inline def getDialogActionsUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDialogActionsUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getDialogContentTextUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDialogContentTextUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getDialogContentUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDialogContentUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getDialogTitleUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDialogTitleUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getDialogUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDialogUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getDividerUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDividerUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getDrawerUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDrawerUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getFabUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFabUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getFilledInputUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFilledInputUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getFormControlLabelUtilityClasses(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFormControlLabelUtilityClasses")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getFormControlUtilityClasses(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFormControlUtilityClasses")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getFormGroupUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFormGroupUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getFormHelperTextUtilityClasses(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFormHelperTextUtilityClasses")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getFormLabelUtilityClasses(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFormLabelUtilityClasses")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getGrid2UtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getGrid2UtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getGridUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getGridUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getIconButtonUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getIconButtonUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getIconUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getIconUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getImageListItemBarUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getImageListItemBarUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getImageListItemUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getImageListItemUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getImageListUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getImageListUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getInputAdornmentUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getInputAdornmentUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getInputBaseUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getInputBaseUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getInputLabelUtilityClasses(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getInputLabelUtilityClasses")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getInputUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getInputUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getLinearProgressUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getLinearProgressUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getLinkUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getLinkUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getListItemAvatarUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getListItemAvatarUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getListItemButtonUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getListItemButtonUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getListItemIconUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getListItemIconUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getListItemSecondaryActionClassesUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getListItemSecondaryActionClassesUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getListItemTextUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getListItemTextUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getListItemUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getListItemUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getListSubheaderUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getListSubheaderUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getListUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getListUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getLuminance(color: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getLuminance")(color.asInstanceOf[js.Any]).asInstanceOf[Double]

inline def getMenuItemUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getMenuItemUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getMenuUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getMenuUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getMobileStepperUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getMobileStepperUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getModalUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getModalUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getNativeSelectUtilityClasses(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getNativeSelectUtilityClasses")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

@scala.annotation.targetName("getOffsetLeft_center_right_left")
inline def getOffsetLeft(rect: DOMRect, horizontal: "center" | "right" | "left"): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getOffsetLeft")(rect.asInstanceOf[js.Any], horizontal.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def getOffsetLeft(rect: DOMRect, horizontal: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getOffsetLeft")(rect.asInstanceOf[js.Any], horizontal.asInstanceOf[js.Any])).asInstanceOf[Double]

@scala.annotation.targetName("getOffsetTop_center_bottom_top")
inline def getOffsetTop(rect: DOMRect, vertical: "center" | "bottom" | "top"): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getOffsetTop")(rect.asInstanceOf[js.Any], vertical.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def getOffsetTop(rect: DOMRect, vertical: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getOffsetTop")(rect.asInstanceOf[js.Any], vertical.asInstanceOf[js.Any])).asInstanceOf[Double]

inline def getOutlinedInputUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getOutlinedInputUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getOverlayAlpha(elevation: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getOverlayAlpha")(elevation.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getPaginationItemUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPaginationItemUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getPaginationUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPaginationUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getPaperUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPaperUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getPopoverUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPopoverUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getRadioUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getRadioUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getRatingUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getRatingUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getScopedCssBaselineUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getScopedCssBaselineUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getSelectUtilityClasses(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSelectUtilityClasses")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getSkeletonUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSkeletonUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getSliderUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSliderUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getSnackbarContentUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSnackbarContentUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getSnackbarUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSnackbarUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getSpeedDialActionUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSpeedDialActionUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getSpeedDialIconUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSpeedDialIconUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getSpeedDialUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSpeedDialUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getStackUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getStackUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getStepButtonUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getStepButtonUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getStepConnectorUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getStepConnectorUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getStepContentUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getStepContentUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getStepIconUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getStepIconUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getStepLabelUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getStepLabelUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getStepUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getStepUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getStepperUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getStepperUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getSvgIconUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSvgIconUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getSwitchUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSwitchUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getTabScrollButtonUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTabScrollButtonUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getTabUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTabUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getTableBodyUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTableBodyUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getTableCellUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTableCellUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getTableContainerUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTableContainerUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getTableFooterUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTableFooterUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getTableHeadUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTableHeadUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getTablePaginationUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTablePaginationUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getTableRowUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTableRowUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getTableSortLabelUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTableSortLabelUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getTableUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTableUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getTabsUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTabsUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getTextFieldUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTextFieldUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getToggleButtonGroupUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getToggleButtonGroupUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getToggleButtonUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getToggleButtonUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getToolbarUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getToolbarUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getTooltipUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTooltipUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getTouchRippleUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTouchRippleUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getTypographyUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypographyUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]

inline def grid2Classes: GridClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("grid2Classes").asInstanceOf[GridClasses]

inline def gridClasses: com.olvind.mui.muiMaterial.gridGridClassesMod.GridClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("gridClasses").asInstanceOf[com.olvind.mui.muiMaterial.gridGridClassesMod.GridClasses]

inline def hexToRgb(hex: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hexToRgb")(hex.asInstanceOf[js.Any]).asInstanceOf[String]

inline def hslToRgb(color: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hslToRgb")(color.asInstanceOf[js.Any]).asInstanceOf[String]

inline def iconButtonClasses: IconButtonClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("iconButtonClasses").asInstanceOf[IconButtonClasses]

inline def iconClasses: IconClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("iconClasses").asInstanceOf[IconClasses]

inline def imageListClasses: ImageListClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("imageListClasses").asInstanceOf[ImageListClasses]

inline def imageListItemBarClasses: ImageListItemBarClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("imageListItemBarClasses").asInstanceOf[ImageListItemBarClasses]

inline def imageListItemClasses: ImageListItemClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("imageListItemClasses").asInstanceOf[ImageListItemClasses]

inline def inputAdornmentClasses: InputAdornmentClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("inputAdornmentClasses").asInstanceOf[InputAdornmentClasses]

inline def inputBaseClasses: InputBaseClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("inputBaseClasses").asInstanceOf[InputBaseClasses]

inline def inputClasses: InputClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("inputClasses").asInstanceOf[InputClasses]

inline def inputLabelClasses: InputLabelClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("inputLabelClasses").asInstanceOf[InputLabelClasses]

inline def isMuiElement(element: Any, muiNames: js.Array[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMuiElement")(element.asInstanceOf[js.Any], muiNames.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def keyframes(args: CSSInterpolation*): Keyframes = ^.asInstanceOf[js.Dynamic].applyDynamic("keyframes")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Keyframes]
inline def keyframes(template: TemplateStringsArray, args: CSSInterpolation*): Keyframes = ^.asInstanceOf[js.Dynamic].applyDynamic("keyframes")(scala.List(template.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Keyframes]

inline def lighten(color: String, coefficient: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("lighten")(color.asInstanceOf[js.Any], coefficient.asInstanceOf[js.Any])).asInstanceOf[String]

inline def linearProgressClasses: LinearProgressClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("linearProgressClasses").asInstanceOf[LinearProgressClasses]

inline def linkClasses: LinkClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("linkClasses").asInstanceOf[LinkClasses]

inline def listClasses: ListClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("listClasses").asInstanceOf[ListClasses]

inline def listItemAvatarClasses: ListItemAvatarClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("listItemAvatarClasses").asInstanceOf[ListItemAvatarClasses]

inline def listItemButtonClasses: ListItemButtonClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("listItemButtonClasses").asInstanceOf[ListItemButtonClasses]

inline def listItemClasses: ListItemClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("listItemClasses").asInstanceOf[ListItemClasses]

inline def listItemIconClasses: ListItemIconClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("listItemIconClasses").asInstanceOf[ListItemIconClasses]

inline def listItemSecondaryActionClasses: ListItemSecondaryActionClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("listItemSecondaryActionClasses").asInstanceOf[ListItemSecondaryActionClasses]

inline def listItemTextClasses: ListItemTextClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("listItemTextClasses").asInstanceOf[ListItemTextClasses]

inline def listSubheaderClasses: ListSubheaderClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("listSubheaderClasses").asInstanceOf[ListSubheaderClasses]

inline def makeStyles(stylesCreator: Any): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("makeStyles")(stylesCreator.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
inline def makeStyles(stylesCreator: Any, options: js.Object): scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("makeStyles")(stylesCreator.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Nothing]

inline def menuClasses: MenuClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("menuClasses").asInstanceOf[MenuClasses]

inline def menuItemClasses: MenuItemClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("menuItemClasses").asInstanceOf[MenuItemClasses]

inline def mobileStepperClasses: MobileStepperClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("mobileStepperClasses").asInstanceOf[MobileStepperClasses]

inline def modalClasses: ModalClasses_ = ^.asInstanceOf[js.Dynamic].selectDynamic("modalClasses").asInstanceOf[ModalClasses_]

inline def modalUnstyledClasses: ModalUnstyledClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("modalUnstyledClasses").asInstanceOf[ModalUnstyledClasses]

inline def nativeSelectClasses: NativeSelectClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("nativeSelectClasses").asInstanceOf[NativeSelectClasses]

inline def outlinedInputClasses: OutlinedInputClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("outlinedInputClasses").asInstanceOf[OutlinedInputClasses]

inline def ownerDocument(): Document = ^.asInstanceOf[js.Dynamic].applyDynamic("ownerDocument")().asInstanceOf[Document]
inline def ownerDocument(node: org.scalajs.dom.Node): Document = ^.asInstanceOf[js.Dynamic].applyDynamic("ownerDocument")(node.asInstanceOf[js.Any]).asInstanceOf[Document]

inline def ownerWindow(): Window = ^.asInstanceOf[js.Dynamic].applyDynamic("ownerWindow")().asInstanceOf[Window]
inline def ownerWindow(node: org.scalajs.dom.Node): Window = ^.asInstanceOf[js.Dynamic].applyDynamic("ownerWindow")(node.asInstanceOf[js.Any]).asInstanceOf[Window]

inline def paginationClasses: PaginationClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("paginationClasses").asInstanceOf[PaginationClasses]

inline def paginationItemClasses: PaginationItemClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("paginationItemClasses").asInstanceOf[PaginationItemClasses]

inline def paperClasses: PaperClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("paperClasses").asInstanceOf[PaperClasses]

inline def popoverClasses: PopoverClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("popoverClasses").asInstanceOf[PopoverClasses]

inline def privateCreateTypography(palette: Palette, typography: TypographyOptions): com.olvind.mui.muiMaterial.stylesCreateTypographyMod.Typography = (^.asInstanceOf[js.Dynamic].applyDynamic("private_createTypography")(palette.asInstanceOf[js.Any], typography.asInstanceOf[js.Any])).asInstanceOf[com.olvind.mui.muiMaterial.stylesCreateTypographyMod.Typography]
inline def privateCreateTypography(palette: Palette, typography: js.Function1[/* palette */ Palette, TypographyOptions]): com.olvind.mui.muiMaterial.stylesCreateTypographyMod.Typography = (^.asInstanceOf[js.Dynamic].applyDynamic("private_createTypography")(palette.asInstanceOf[js.Any], typography.asInstanceOf[js.Any])).asInstanceOf[com.olvind.mui.muiMaterial.stylesCreateTypographyMod.Typography]

inline def privateExcludeVariablesFromRoot(cssVarPrefix: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("private_excludeVariablesFromRoot")(cssVarPrefix.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]

inline def radioClasses: RadioClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("radioClasses").asInstanceOf[RadioClasses]

inline def ratingClasses: RatingClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("ratingClasses").asInstanceOf[RatingClasses]

inline def recomposeColor(color: ColorObject): String = ^.asInstanceOf[js.Dynamic].applyDynamic("recomposeColor")(color.asInstanceOf[js.Any]).asInstanceOf[String]

inline def requirePropFactory(componentNameInError: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("requirePropFactory")(componentNameInError.asInstanceOf[js.Any]).asInstanceOf[Any]
inline def requirePropFactory(componentNameInError: String, Component: JSXElementConstructor[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("requirePropFactory")(componentNameInError.asInstanceOf[js.Any], Component.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def responsiveFontSizes(theme: Theme): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("responsiveFontSizes")(theme.asInstanceOf[js.Any]).asInstanceOf[Theme]
inline def responsiveFontSizes(theme: Theme, options: ResponsiveFontSizesOptions): Theme = (^.asInstanceOf[js.Dynamic].applyDynamic("responsiveFontSizes")(theme.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Theme]

inline def rgbToHex(color: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("rgbToHex")(color.asInstanceOf[js.Any]).asInstanceOf[String]

inline def selectClasses: SelectClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("selectClasses").asInstanceOf[SelectClasses]

inline def setRef[T](): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setRef")().asInstanceOf[Unit]
inline def setRef[T](ref: MutableRefObject[T | Null]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setRef")(ref.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def setRef[T](ref: MutableRefObject[T | Null], value: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setRef")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def setRef[T](ref: js.Function1[/* instance */ T | Null, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setRef")(ref.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def setRef[T](ref: js.Function1[/* instance */ T | Null, Unit], value: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setRef")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def setRef[T](ref: Null, value: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setRef")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def setRef[T](ref: Unit, value: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setRef")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def shouldSkipGeneratingVar(keys: js.Array[String]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldSkipGeneratingVar")(keys.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def skeletonClasses: SkeletonClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("skeletonClasses").asInstanceOf[SkeletonClasses]

inline def sliderClasses: SliderClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("sliderClasses").asInstanceOf[SliderClasses]

inline def snackbarClasses: SnackbarClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("snackbarClasses").asInstanceOf[SnackbarClasses]

inline def snackbarContentClasses: SnackbarContentClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("snackbarContentClasses").asInstanceOf[SnackbarContentClasses]

inline def speedDialActionClasses: SpeedDialActionClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("speedDialActionClasses").asInstanceOf[SpeedDialActionClasses]

inline def speedDialClasses: SpeedDialClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("speedDialClasses").asInstanceOf[SpeedDialClasses]

inline def speedDialIconClasses: SpeedDialIconClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("speedDialIconClasses").asInstanceOf[SpeedDialIconClasses]

inline def stackClasses: StackClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("stackClasses").asInstanceOf[StackClasses]

inline def stepButtonClasses: StepButtonClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("stepButtonClasses").asInstanceOf[StepButtonClasses]

inline def stepClasses: StepClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("stepClasses").asInstanceOf[StepClasses]

inline def stepConnectorClasses: StepConnectorClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("stepConnectorClasses").asInstanceOf[StepConnectorClasses]

inline def stepContentClasses: StepContentClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("stepContentClasses").asInstanceOf[StepContentClasses]

inline def stepIconClasses: StepIconClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("stepIconClasses").asInstanceOf[StepIconClasses]

inline def stepLabelClasses: StepLabelClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("stepLabelClasses").asInstanceOf[StepLabelClasses]

inline def stepperClasses: StepperClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("stepperClasses").asInstanceOf[StepperClasses]

/**
  * Custom styled utility that has a default MUI theme.
  * @param tag HTML tag or component that should serve as base.
  * @param options Styled options for the created component.
  * @returns React component that has styles attached to it.
  */
inline def styled: CreateMUIStyled[Theme] = ^.asInstanceOf[js.Dynamic].selectDynamic("styled").asInstanceOf[CreateMUIStyled[Theme]]

inline def svgIconClasses: SvgIconClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("svgIconClasses").asInstanceOf[SvgIconClasses]

inline def switchClasses: SwitchClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("switchClasses").asInstanceOf[SwitchClasses]

inline def tabClasses: TabClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("tabClasses").asInstanceOf[TabClasses]

inline def tabScrollButtonClasses: TabScrollButtonClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("tabScrollButtonClasses").asInstanceOf[TabScrollButtonClasses]

inline def tableBodyClasses: TableBodyClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("tableBodyClasses").asInstanceOf[TableBodyClasses]

inline def tableCellClasses: TableCellClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("tableCellClasses").asInstanceOf[TableCellClasses]

inline def tableClasses: TableClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("tableClasses").asInstanceOf[TableClasses]

inline def tableContainerClasses: TableContainerClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("tableContainerClasses").asInstanceOf[TableContainerClasses]

inline def tableFooterClasses: TableFooterClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("tableFooterClasses").asInstanceOf[TableFooterClasses]

inline def tableHeadClasses: TableHeadClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("tableHeadClasses").asInstanceOf[TableHeadClasses]

inline def tablePaginationClasses: TablePaginationClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("tablePaginationClasses").asInstanceOf[TablePaginationClasses]

inline def tableRowClasses: TableRowClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("tableRowClasses").asInstanceOf[TableRowClasses]

inline def tableSortLabelClasses: TableSortLabelClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("tableSortLabelClasses").asInstanceOf[TableSortLabelClasses]

inline def tabsClasses: TabsClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("tabsClasses").asInstanceOf[TabsClasses]

inline def textFieldClasses: TextFieldClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("textFieldClasses").asInstanceOf[TextFieldClasses]

inline def toggleButtonClasses: ToggleButtonClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("toggleButtonClasses").asInstanceOf[ToggleButtonClasses]

inline def toggleButtonGroupClasses: ToggleButtonGroupClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("toggleButtonGroupClasses").asInstanceOf[ToggleButtonGroupClasses]

inline def toolbarClasses: ToolbarClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("toolbarClasses").asInstanceOf[ToolbarClasses]

inline def tooltipClasses: TooltipClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("tooltipClasses").asInstanceOf[TooltipClasses]

inline def touchRippleClasses: TouchRippleClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("touchRippleClasses").asInstanceOf[TouchRippleClasses]

inline def typographyClasses: TypographyClasses = ^.asInstanceOf[js.Dynamic].selectDynamic("typographyClasses").asInstanceOf[TypographyClasses]

@scala.annotation.targetName("unstableComposeClasses_false")
inline def unstableComposeClasses[ClassKey /* <: String */](
  slots: Record[ClassKey, js.Array[js.UndefOr[String | false | Null]]],
  getUtilityClass: js.Function1[/* slot */ String, String]
): Record[ClassKey, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("unstable_composeClasses")(slots.asInstanceOf[js.Any], getUtilityClass.asInstanceOf[js.Any])).asInstanceOf[Record[ClassKey, String]]
@scala.annotation.targetName("unstableComposeClasses_false")
inline def unstableComposeClasses[ClassKey /* <: String */](
  slots: Record[ClassKey, js.Array[js.UndefOr[String | false | Null]]],
  getUtilityClass: js.Function1[/* slot */ String, String],
  classes: Record[String, String]
): Record[ClassKey, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("unstable_composeClasses")(slots.asInstanceOf[js.Any], getUtilityClass.asInstanceOf[js.Any], classes.asInstanceOf[js.Any])).asInstanceOf[Record[ClassKey, String]]

inline def unstableCreateMuiStrictModeTheme(options: ThemeOptions, args: js.Object*): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_createMuiStrictModeTheme")(scala.List(options.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Theme]
inline def unstableCreateMuiStrictModeTheme(options: Unit, args: js.Object*): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_createMuiStrictModeTheme")(scala.List(options.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Theme]

inline def unstableGetUnit(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_getUnit")(input.asInstanceOf[js.Any]).asInstanceOf[String]

inline def unstableToUnitless(value: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_toUnitless")(value.asInstanceOf[js.Any]).asInstanceOf[Double]

inline def unstableUseEnhancedEffect(effect: EffectCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_useEnhancedEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def unstableUseEnhancedEffect(effect: EffectCallback, deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unstable_useEnhancedEffect")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def unstableUseId(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_useId")().asInstanceOf[js.UndefOr[String]]
inline def unstableUseId(idOverride: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_useId")(idOverride.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]

inline def unsupportedProp(
  props: StringDictionary[Any],
  propName: String,
  componentName: String,
  location: String,
  propFullName: String
): js.Error | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("unsupportedProp")(props.asInstanceOf[js.Any], propName.asInstanceOf[js.Any], componentName.asInstanceOf[js.Any], location.asInstanceOf[js.Any], propFullName.asInstanceOf[js.Any])).asInstanceOf[js.Error | Null]

inline def useAutocomplete[T, Multiple /* <: js.UndefOr[Boolean] */, DisableClearable /* <: js.UndefOr[Boolean] */, FreeSolo /* <: js.UndefOr[Boolean] */](props: UseAutocompleteProps[T, Multiple, DisableClearable, FreeSolo]): UseAutocompleteReturnValue[T, Multiple, DisableClearable, FreeSolo] = ^.asInstanceOf[js.Dynamic].applyDynamic("useAutocomplete")(props.asInstanceOf[js.Any]).asInstanceOf[UseAutocompleteReturnValue[T, Multiple, DisableClearable, FreeSolo]]

inline def useControlled[T](props: UseControlledProps[T]): js.Tuple2[T, js.Function1[/* newValue */ T | (js.Function1[/* prevValue */ T, T]), Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useControlled")(props.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[T, js.Function1[/* newValue */ T | (js.Function1[/* prevValue */ T, T]), Unit]]]

inline def useEventCallback[Args /* <: js.Array[Any] */, Return](fn: js.Function1[/* args */ Args, Return]): js.Function1[/* args */ Args, Return] = ^.asInstanceOf[js.Dynamic].applyDynamic("useEventCallback")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* args */ Args, Return]]

inline def useForkRef[Instance](refs: js.UndefOr[Ref[Instance]]*): RefFn[Instance] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("useForkRef")(refs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[RefFn[Instance] | Null]

inline def useFormControl(): js.UndefOr[FormControlState] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFormControl")().asInstanceOf[js.UndefOr[FormControlState]]

inline def useIsFocusVisible(): UseIsFocusVisibleResult = ^.asInstanceOf[js.Dynamic].applyDynamic("useIsFocusVisible")().asInstanceOf[UseIsFocusVisibleResult]

inline def useMediaQuery[Theme](queryInput: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useMediaQuery")(queryInput.asInstanceOf[js.Any]).asInstanceOf[Boolean]
inline def useMediaQuery[Theme](queryInput: String, options: UseMediaQueryOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("useMediaQuery")(queryInput.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def useMediaQuery[Theme](queryInput: js.Function1[/* theme */ Theme, String]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useMediaQuery")(queryInput.asInstanceOf[js.Any]).asInstanceOf[Boolean]
inline def useMediaQuery[Theme](queryInput: js.Function1[/* theme */ Theme, String], options: UseMediaQueryOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("useMediaQuery")(queryInput.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def useRadioGroup(): js.UndefOr[RadioGroupState] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRadioGroup")().asInstanceOf[js.UndefOr[RadioGroupState]]

inline def useScrollTrigger(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useScrollTrigger")().asInstanceOf[Boolean]
inline def useScrollTrigger(options: UseScrollTriggerOptions): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useScrollTrigger")(options.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def useStepContext(): StepContextType | js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("useStepContext")().asInstanceOf[StepContextType | js.Object]

inline def useStepperContext(): StepperContextType | js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("useStepperContext")().asInstanceOf[StepperContextType | js.Object]

inline def useTheme[T](): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useTheme")().asInstanceOf[T]

inline def useThemeProps[Theme /* <: ThemeWithProps */, Props, Name /* <: /* keyof any */ String */](params: NameProps[Props, Name]): Props & (ThemedProps[Theme, Name]) = ^.asInstanceOf[js.Dynamic].applyDynamic("useThemeProps")(params.asInstanceOf[js.Any]).asInstanceOf[Props & (ThemedProps[Theme, Name])]

inline def withStyles(stylesCreator: Any): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("withStyles")(stylesCreator.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
inline def withStyles(stylesCreator: Any, options: js.Object): scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("withStyles")(stylesCreator.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Nothing]

inline def withTheme(Component: Any): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("withTheme")(Component.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]

type InternalStandardProps[C, Removals /* <: /* keyof C */ String */] = (DistributiveOmit[C, "classes" | Removals]) & (// each component declares it's classes in a separate interface for proper JSDoc
StyledComponentProps[scala.Nothing]) & ClassNameRef[C]

type PaletteMode = "light" | "dark"

type StandardProps[C, ClassKey /* <: String */, Removals /* <: /* keyof C */ String */] = (DistributiveOmit[C, "classes" | Removals]) & StyledComponentProps[ClassKey] & Style[C]
