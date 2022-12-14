package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chipChipClassesMod {
  
  @JSImport("@mui/material/Chip/chipClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/Chip/chipClasses", JSImport.Default)
  @js.native
  val default: ChipClasses = js.native
  
  inline def getChipUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getChipUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type ChipClassKey = "root" | "sizeSmall" | "sizeMedium" | "colorError" | "colorInfo" | "colorPrimary" | "colorSecondary" | "colorSuccess" | "colorWarning" | "disabled" | "clickable" | "clickableColorPrimary" | "clickableColorSecondary" | "deletable" | "deletableColorPrimary" | "deletableColorSecondary" | "outlined" | "filled" | "outlinedPrimary" | "outlinedSecondary" | "filledPrimary" | "filledSecondary" | "avatar" | "avatarSmall" | "avatarMedium" | "avatarColorPrimary" | "avatarColorSecondary" | "icon" | "iconSmall" | "iconMedium" | "iconColorPrimary" | "iconColorSecondary" | "label" | "labelSmall" | "labelMedium" | "deleteIcon" | "deleteIconSmall" | "deleteIconMedium" | "deleteIconColorPrimary" | "deleteIconColorSecondary" | "deleteIconOutlinedColorPrimary" | "deleteIconOutlinedColorSecondary" | "deleteIconFilledColorPrimary" | "deleteIconFilledColorSecondary" | "focusVisible"
  
  trait ChipClasses extends StObject {
    
    /** Styles applied to the avatar element. */
    var avatar: String
    
    /** Styles applied to the avatar element if `color="primary"`. */
    var avatarColorPrimary: String
    
    /** Styles applied to the avatar element if `color="secondary"`. */
    var avatarColorSecondary: String
    
    /** Styles applied to the avatar element if `size="medium"`. */
    var avatarMedium: String
    
    /** Styles applied to the avatar element if `size="small"`. */
    var avatarSmall: String
    
    /** Styles applied to the root element if `onClick` is defined or `clickable={true}`. */
    var clickable: String
    
    /** Styles applied to the root element if `onClick` and `color="primary"` is defined or `clickable={true}`. */
    var clickableColorPrimary: String
    
    /** Styles applied to the root element if `onClick` and `color="secondary"` is defined or `clickable={true}`. */
    var clickableColorSecondary: String
    
    /** Styles applied to the root element if `color="error"`. */
    var colorError: String
    
    /** Styles applied to the root element if `color="info"`. */
    var colorInfo: String
    
    /** Styles applied to the root element if `color="primary"`. */
    var colorPrimary: String
    
    /** Styles applied to the root element if `color="secondary"`. */
    var colorSecondary: String
    
    /** Styles applied to the root element if `color="success"`. */
    var colorSuccess: String
    
    /** Styles applied to the root element if `color="warning"`. */
    var colorWarning: String
    
    /** Styles applied to the root element if `onDelete` is defined. */
    var deletable: String
    
    /** Styles applied to the root element if `onDelete` and `color="primary"` is defined. */
    var deletableColorPrimary: String
    
    /** Styles applied to the root element if `onDelete` and `color="secondary"` is defined. */
    var deletableColorSecondary: String
    
    /** Styles applied to the deleteIcon element. */
    var deleteIcon: String
    
    /** Styles applied to the deleteIcon element if `color="primary"` and `variant="filled"`. */
    var deleteIconColorPrimary: String
    
    /** Styles applied to the deleteIcon element if `color="secondary"` and `variant="filled"`. */
    var deleteIconColorSecondary: String
    
    /** Styles applied to the deleteIcon element if `color="primary"` and `variant="filled"`. */
    var deleteIconFilledColorPrimary: String
    
    /** Styles applied to the deleteIcon element if `color="secondary"` and `variant="filled"`. */
    var deleteIconFilledColorSecondary: String
    
    /** Styles applied to the deleteIcon element if `size="medium"`. */
    var deleteIconMedium: String
    
    /** Styles applied to the deleteIcon element if `color="primary"` and `variant="outlined"`. */
    var deleteIconOutlinedColorPrimary: String
    
    /** Styles applied to the deleteIcon element if `color="secondary"` and `variant="outlined"`. */
    var deleteIconOutlinedColorSecondary: String
    
    /** Styles applied to the deleteIcon element if `size="small"`. */
    var deleteIconSmall: String
    
    /** State class applied to the root element if `disabled={true}`. */
    var disabled: String
    
    /** Styles applied to the root element if `variant="filled"`. */
    var filled: String
    
    /** Styles applied to the root element if `variant="filled"` and `color="primary"`. */
    var filledPrimary: String
    
    /** Styles applied to the root element if `variant="filled"` and `color="secondary"`. */
    var filledSecondary: String
    
    /** State class applied to the root element if keyboard focused. */
    var focusVisible: String
    
    /** Styles applied to the icon element. */
    var icon: String
    
    /** Styles applied to the icon element if `color="primary"`. */
    var iconColorPrimary: String
    
    /** Styles applied to the icon element if `color="secondary"`. */
    var iconColorSecondary: String
    
    /** Styles applied to the icon element if `size="medium"`. */
    var iconMedium: String
    
    /** Styles applied to the icon element if `size="small"`. */
    var iconSmall: String
    
    /** Styles applied to the label `span` element. */
    var label: String
    
    /** Styles applied to the label `span` element if `size="medium"`. */
    var labelMedium: String
    
    /** Styles applied to the label `span` element if `size="small"`. */
    var labelSmall: String
    
    /** Styles applied to the root element if `variant="outlined"`. */
    var outlined: String
    
    /** Styles applied to the root element if `variant="outlined"` and `color="primary"`. */
    var outlinedPrimary: String
    
    /** Styles applied to the root element if `variant="outlined"` and `color="secondary"`. */
    var outlinedSecondary: String
    
    /** Styles applied to the root element. */
    var root: String
    
    /** Styles applied to the root element if `size="medium"`. */
    var sizeMedium: String
    
    /** Styles applied to the root element if `size="small"`. */
    var sizeSmall: String
  }
  object ChipClasses {
    
    inline def apply(
      avatar: String,
      avatarColorPrimary: String,
      avatarColorSecondary: String,
      avatarMedium: String,
      avatarSmall: String,
      clickable: String,
      clickableColorPrimary: String,
      clickableColorSecondary: String,
      colorError: String,
      colorInfo: String,
      colorPrimary: String,
      colorSecondary: String,
      colorSuccess: String,
      colorWarning: String,
      deletable: String,
      deletableColorPrimary: String,
      deletableColorSecondary: String,
      deleteIcon: String,
      deleteIconColorPrimary: String,
      deleteIconColorSecondary: String,
      deleteIconFilledColorPrimary: String,
      deleteIconFilledColorSecondary: String,
      deleteIconMedium: String,
      deleteIconOutlinedColorPrimary: String,
      deleteIconOutlinedColorSecondary: String,
      deleteIconSmall: String,
      disabled: String,
      filled: String,
      filledPrimary: String,
      filledSecondary: String,
      focusVisible: String,
      icon: String,
      iconColorPrimary: String,
      iconColorSecondary: String,
      iconMedium: String,
      iconSmall: String,
      label: String,
      labelMedium: String,
      labelSmall: String,
      outlined: String,
      outlinedPrimary: String,
      outlinedSecondary: String,
      root: String,
      sizeMedium: String,
      sizeSmall: String
    ): ChipClasses = {
      val __obj = js.Dynamic.literal(avatar = avatar.asInstanceOf[js.Any], avatarColorPrimary = avatarColorPrimary.asInstanceOf[js.Any], avatarColorSecondary = avatarColorSecondary.asInstanceOf[js.Any], avatarMedium = avatarMedium.asInstanceOf[js.Any], avatarSmall = avatarSmall.asInstanceOf[js.Any], clickable = clickable.asInstanceOf[js.Any], clickableColorPrimary = clickableColorPrimary.asInstanceOf[js.Any], clickableColorSecondary = clickableColorSecondary.asInstanceOf[js.Any], colorError = colorError.asInstanceOf[js.Any], colorInfo = colorInfo.asInstanceOf[js.Any], colorPrimary = colorPrimary.asInstanceOf[js.Any], colorSecondary = colorSecondary.asInstanceOf[js.Any], colorSuccess = colorSuccess.asInstanceOf[js.Any], colorWarning = colorWarning.asInstanceOf[js.Any], deletable = deletable.asInstanceOf[js.Any], deletableColorPrimary = deletableColorPrimary.asInstanceOf[js.Any], deletableColorSecondary = deletableColorSecondary.asInstanceOf[js.Any], deleteIcon = deleteIcon.asInstanceOf[js.Any], deleteIconColorPrimary = deleteIconColorPrimary.asInstanceOf[js.Any], deleteIconColorSecondary = deleteIconColorSecondary.asInstanceOf[js.Any], deleteIconFilledColorPrimary = deleteIconFilledColorPrimary.asInstanceOf[js.Any], deleteIconFilledColorSecondary = deleteIconFilledColorSecondary.asInstanceOf[js.Any], deleteIconMedium = deleteIconMedium.asInstanceOf[js.Any], deleteIconOutlinedColorPrimary = deleteIconOutlinedColorPrimary.asInstanceOf[js.Any], deleteIconOutlinedColorSecondary = deleteIconOutlinedColorSecondary.asInstanceOf[js.Any], deleteIconSmall = deleteIconSmall.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], filled = filled.asInstanceOf[js.Any], filledPrimary = filledPrimary.asInstanceOf[js.Any], filledSecondary = filledSecondary.asInstanceOf[js.Any], focusVisible = focusVisible.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], iconColorPrimary = iconColorPrimary.asInstanceOf[js.Any], iconColorSecondary = iconColorSecondary.asInstanceOf[js.Any], iconMedium = iconMedium.asInstanceOf[js.Any], iconSmall = iconSmall.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelMedium = labelMedium.asInstanceOf[js.Any], labelSmall = labelSmall.asInstanceOf[js.Any], outlined = outlined.asInstanceOf[js.Any], outlinedPrimary = outlinedPrimary.asInstanceOf[js.Any], outlinedSecondary = outlinedSecondary.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], sizeMedium = sizeMedium.asInstanceOf[js.Any], sizeSmall = sizeSmall.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChipClasses]
    }
    
    extension [Self <: ChipClasses](x: Self) {
      
      inline def setAvatar(value: String): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
      
      inline def setAvatarColorPrimary(value: String): Self = StObject.set(x, "avatarColorPrimary", value.asInstanceOf[js.Any])
      
      inline def setAvatarColorSecondary(value: String): Self = StObject.set(x, "avatarColorSecondary", value.asInstanceOf[js.Any])
      
      inline def setAvatarMedium(value: String): Self = StObject.set(x, "avatarMedium", value.asInstanceOf[js.Any])
      
      inline def setAvatarSmall(value: String): Self = StObject.set(x, "avatarSmall", value.asInstanceOf[js.Any])
      
      inline def setClickable(value: String): Self = StObject.set(x, "clickable", value.asInstanceOf[js.Any])
      
      inline def setClickableColorPrimary(value: String): Self = StObject.set(x, "clickableColorPrimary", value.asInstanceOf[js.Any])
      
      inline def setClickableColorSecondary(value: String): Self = StObject.set(x, "clickableColorSecondary", value.asInstanceOf[js.Any])
      
      inline def setColorError(value: String): Self = StObject.set(x, "colorError", value.asInstanceOf[js.Any])
      
      inline def setColorInfo(value: String): Self = StObject.set(x, "colorInfo", value.asInstanceOf[js.Any])
      
      inline def setColorPrimary(value: String): Self = StObject.set(x, "colorPrimary", value.asInstanceOf[js.Any])
      
      inline def setColorSecondary(value: String): Self = StObject.set(x, "colorSecondary", value.asInstanceOf[js.Any])
      
      inline def setColorSuccess(value: String): Self = StObject.set(x, "colorSuccess", value.asInstanceOf[js.Any])
      
      inline def setColorWarning(value: String): Self = StObject.set(x, "colorWarning", value.asInstanceOf[js.Any])
      
      inline def setDeletable(value: String): Self = StObject.set(x, "deletable", value.asInstanceOf[js.Any])
      
      inline def setDeletableColorPrimary(value: String): Self = StObject.set(x, "deletableColorPrimary", value.asInstanceOf[js.Any])
      
      inline def setDeletableColorSecondary(value: String): Self = StObject.set(x, "deletableColorSecondary", value.asInstanceOf[js.Any])
      
      inline def setDeleteIcon(value: String): Self = StObject.set(x, "deleteIcon", value.asInstanceOf[js.Any])
      
      inline def setDeleteIconColorPrimary(value: String): Self = StObject.set(x, "deleteIconColorPrimary", value.asInstanceOf[js.Any])
      
      inline def setDeleteIconColorSecondary(value: String): Self = StObject.set(x, "deleteIconColorSecondary", value.asInstanceOf[js.Any])
      
      inline def setDeleteIconFilledColorPrimary(value: String): Self = StObject.set(x, "deleteIconFilledColorPrimary", value.asInstanceOf[js.Any])
      
      inline def setDeleteIconFilledColorSecondary(value: String): Self = StObject.set(x, "deleteIconFilledColorSecondary", value.asInstanceOf[js.Any])
      
      inline def setDeleteIconMedium(value: String): Self = StObject.set(x, "deleteIconMedium", value.asInstanceOf[js.Any])
      
      inline def setDeleteIconOutlinedColorPrimary(value: String): Self = StObject.set(x, "deleteIconOutlinedColorPrimary", value.asInstanceOf[js.Any])
      
      inline def setDeleteIconOutlinedColorSecondary(value: String): Self = StObject.set(x, "deleteIconOutlinedColorSecondary", value.asInstanceOf[js.Any])
      
      inline def setDeleteIconSmall(value: String): Self = StObject.set(x, "deleteIconSmall", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setFilled(value: String): Self = StObject.set(x, "filled", value.asInstanceOf[js.Any])
      
      inline def setFilledPrimary(value: String): Self = StObject.set(x, "filledPrimary", value.asInstanceOf[js.Any])
      
      inline def setFilledSecondary(value: String): Self = StObject.set(x, "filledSecondary", value.asInstanceOf[js.Any])
      
      inline def setFocusVisible(value: String): Self = StObject.set(x, "focusVisible", value.asInstanceOf[js.Any])
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconColorPrimary(value: String): Self = StObject.set(x, "iconColorPrimary", value.asInstanceOf[js.Any])
      
      inline def setIconColorSecondary(value: String): Self = StObject.set(x, "iconColorSecondary", value.asInstanceOf[js.Any])
      
      inline def setIconMedium(value: String): Self = StObject.set(x, "iconMedium", value.asInstanceOf[js.Any])
      
      inline def setIconSmall(value: String): Self = StObject.set(x, "iconSmall", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelMedium(value: String): Self = StObject.set(x, "labelMedium", value.asInstanceOf[js.Any])
      
      inline def setLabelSmall(value: String): Self = StObject.set(x, "labelSmall", value.asInstanceOf[js.Any])
      
      inline def setOutlined(value: String): Self = StObject.set(x, "outlined", value.asInstanceOf[js.Any])
      
      inline def setOutlinedPrimary(value: String): Self = StObject.set(x, "outlinedPrimary", value.asInstanceOf[js.Any])
      
      inline def setOutlinedSecondary(value: String): Self = StObject.set(x, "outlinedSecondary", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setSizeMedium(value: String): Self = StObject.set(x, "sizeMedium", value.asInstanceOf[js.Any])
      
      inline def setSizeSmall(value: String): Self = StObject.set(x, "sizeSmall", value.asInstanceOf[js.Any])
    }
  }
}
