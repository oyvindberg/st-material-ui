package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylesZIndexMod extends Shortcut {
  
  @JSImport("@mui/material/styles/zIndex", JSImport.Default)
  @js.native
  val default: ZIndex = js.native
  
  trait ZIndex extends StObject {
    
    var appBar: Double
    
    var drawer: Double
    
    var fab: Double
    
    var mobileStepper: Double
    
    var modal: Double
    
    var snackbar: Double
    
    var speedDial: Double
    
    var tooltip: Double
  }
  object ZIndex {
    
    inline def apply(
      appBar: Double,
      drawer: Double,
      fab: Double,
      mobileStepper: Double,
      modal: Double,
      snackbar: Double,
      speedDial: Double,
      tooltip: Double
    ): ZIndex = {
      val __obj = js.Dynamic.literal(appBar = appBar.asInstanceOf[js.Any], drawer = drawer.asInstanceOf[js.Any], fab = fab.asInstanceOf[js.Any], mobileStepper = mobileStepper.asInstanceOf[js.Any], modal = modal.asInstanceOf[js.Any], snackbar = snackbar.asInstanceOf[js.Any], speedDial = speedDial.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
      __obj.asInstanceOf[ZIndex]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ZIndex] (val x: Self) extends AnyVal {
      
      inline def setAppBar(value: Double): Self = StObject.set(x, "appBar", value.asInstanceOf[js.Any])
      
      inline def setDrawer(value: Double): Self = StObject.set(x, "drawer", value.asInstanceOf[js.Any])
      
      inline def setFab(value: Double): Self = StObject.set(x, "fab", value.asInstanceOf[js.Any])
      
      inline def setMobileStepper(value: Double): Self = StObject.set(x, "mobileStepper", value.asInstanceOf[js.Any])
      
      inline def setModal(value: Double): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
      
      inline def setSnackbar(value: Double): Self = StObject.set(x, "snackbar", value.asInstanceOf[js.Any])
      
      inline def setSpeedDial(value: Double): Self = StObject.set(x, "speedDial", value.asInstanceOf[js.Any])
      
      inline def setTooltip(value: Double): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@mui/material.@mui/material/styles/zIndex.ZIndex> */
  trait ZIndexOptions extends StObject {
    
    var appBar: js.UndefOr[Double] = js.undefined
    
    var drawer: js.UndefOr[Double] = js.undefined
    
    var fab: js.UndefOr[Double] = js.undefined
    
    var mobileStepper: js.UndefOr[Double] = js.undefined
    
    var modal: js.UndefOr[Double] = js.undefined
    
    var snackbar: js.UndefOr[Double] = js.undefined
    
    var speedDial: js.UndefOr[Double] = js.undefined
    
    var tooltip: js.UndefOr[Double] = js.undefined
  }
  object ZIndexOptions {
    
    inline def apply(): ZIndexOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ZIndexOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ZIndexOptions] (val x: Self) extends AnyVal {
      
      inline def setAppBar(value: Double): Self = StObject.set(x, "appBar", value.asInstanceOf[js.Any])
      
      inline def setAppBarUndefined: Self = StObject.set(x, "appBar", js.undefined)
      
      inline def setDrawer(value: Double): Self = StObject.set(x, "drawer", value.asInstanceOf[js.Any])
      
      inline def setDrawerUndefined: Self = StObject.set(x, "drawer", js.undefined)
      
      inline def setFab(value: Double): Self = StObject.set(x, "fab", value.asInstanceOf[js.Any])
      
      inline def setFabUndefined: Self = StObject.set(x, "fab", js.undefined)
      
      inline def setMobileStepper(value: Double): Self = StObject.set(x, "mobileStepper", value.asInstanceOf[js.Any])
      
      inline def setMobileStepperUndefined: Self = StObject.set(x, "mobileStepper", js.undefined)
      
      inline def setModal(value: Double): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
      
      inline def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
      
      inline def setSnackbar(value: Double): Self = StObject.set(x, "snackbar", value.asInstanceOf[js.Any])
      
      inline def setSnackbarUndefined: Self = StObject.set(x, "snackbar", js.undefined)
      
      inline def setSpeedDial(value: Double): Self = StObject.set(x, "speedDial", value.asInstanceOf[js.Any])
      
      inline def setSpeedDialUndefined: Self = StObject.set(x, "speedDial", js.undefined)
      
      inline def setTooltip(value: Double): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    }
  }
  
  type _To = ZIndex
  
  /* This means you don't have to write `default`, but can instead just say `stylesZIndexMod.foo` */
  override def _to: ZIndex = default
}
