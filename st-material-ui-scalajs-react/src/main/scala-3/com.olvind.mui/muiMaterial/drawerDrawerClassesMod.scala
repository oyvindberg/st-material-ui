package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object drawerDrawerClassesMod {
  
  @JSImport("@mui/material/Drawer/drawerClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/Drawer/drawerClasses", JSImport.Default)
  @js.native
  val default: DrawerClasses = js.native
  
  inline def getDrawerUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDrawerUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type DrawerClassKey = "root" | "docked" | "paper" | "paperAnchorLeft" | "paperAnchorRight" | "paperAnchorTop" | "paperAnchorBottom" | "paperAnchorDockedLeft" | "paperAnchorDockedTop" | "paperAnchorDockedRight" | "paperAnchorDockedBottom" | "modal"
  
  trait DrawerClasses extends StObject {
    
    /** Styles applied to the root element if `variant="permanent or persistent"`. */
    var docked: String
    
    /** Styles applied to the Modal component. */
    var modal: String
    
    /** Styles applied to the Paper component. */
    var paper: String
    
    /** Styles applied to the Paper component if `anchor="bottom"`. */
    var paperAnchorBottom: String
    
    /** Styles applied to the Paper component if `anchor="bottom"` and `variant` is not "temporary". */
    var paperAnchorDockedBottom: String
    
    /** Styles applied to the Paper component if `anchor="left"` and `variant` is not "temporary". */
    var paperAnchorDockedLeft: String
    
    /** Styles applied to the Paper component if `anchor="right"` and `variant` is not "temporary". */
    var paperAnchorDockedRight: String
    
    /** Styles applied to the Paper component if `anchor="top"` and `variant` is not "temporary". */
    var paperAnchorDockedTop: String
    
    /** Styles applied to the Paper component if `anchor="left"`. */
    var paperAnchorLeft: String
    
    /** Styles applied to the Paper component if `anchor="right"`. */
    var paperAnchorRight: String
    
    /** Styles applied to the Paper component if `anchor="top"`. */
    var paperAnchorTop: String
    
    /** Styles applied to the root element. */
    var root: String
  }
  object DrawerClasses {
    
    inline def apply(
      docked: String,
      modal: String,
      paper: String,
      paperAnchorBottom: String,
      paperAnchorDockedBottom: String,
      paperAnchorDockedLeft: String,
      paperAnchorDockedRight: String,
      paperAnchorDockedTop: String,
      paperAnchorLeft: String,
      paperAnchorRight: String,
      paperAnchorTop: String,
      root: String
    ): DrawerClasses = {
      val __obj = js.Dynamic.literal(docked = docked.asInstanceOf[js.Any], modal = modal.asInstanceOf[js.Any], paper = paper.asInstanceOf[js.Any], paperAnchorBottom = paperAnchorBottom.asInstanceOf[js.Any], paperAnchorDockedBottom = paperAnchorDockedBottom.asInstanceOf[js.Any], paperAnchorDockedLeft = paperAnchorDockedLeft.asInstanceOf[js.Any], paperAnchorDockedRight = paperAnchorDockedRight.asInstanceOf[js.Any], paperAnchorDockedTop = paperAnchorDockedTop.asInstanceOf[js.Any], paperAnchorLeft = paperAnchorLeft.asInstanceOf[js.Any], paperAnchorRight = paperAnchorRight.asInstanceOf[js.Any], paperAnchorTop = paperAnchorTop.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[DrawerClasses]
    }
    
    extension [Self <: DrawerClasses](x: Self) {
      
      inline def setDocked(value: String): Self = StObject.set(x, "docked", value.asInstanceOf[js.Any])
      
      inline def setModal(value: String): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
      
      inline def setPaper(value: String): Self = StObject.set(x, "paper", value.asInstanceOf[js.Any])
      
      inline def setPaperAnchorBottom(value: String): Self = StObject.set(x, "paperAnchorBottom", value.asInstanceOf[js.Any])
      
      inline def setPaperAnchorDockedBottom(value: String): Self = StObject.set(x, "paperAnchorDockedBottom", value.asInstanceOf[js.Any])
      
      inline def setPaperAnchorDockedLeft(value: String): Self = StObject.set(x, "paperAnchorDockedLeft", value.asInstanceOf[js.Any])
      
      inline def setPaperAnchorDockedRight(value: String): Self = StObject.set(x, "paperAnchorDockedRight", value.asInstanceOf[js.Any])
      
      inline def setPaperAnchorDockedTop(value: String): Self = StObject.set(x, "paperAnchorDockedTop", value.asInstanceOf[js.Any])
      
      inline def setPaperAnchorLeft(value: String): Self = StObject.set(x, "paperAnchorLeft", value.asInstanceOf[js.Any])
      
      inline def setPaperAnchorRight(value: String): Self = StObject.set(x, "paperAnchorRight", value.asInstanceOf[js.Any])
      
      inline def setPaperAnchorTop(value: String): Self = StObject.set(x, "paperAnchorTop", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
