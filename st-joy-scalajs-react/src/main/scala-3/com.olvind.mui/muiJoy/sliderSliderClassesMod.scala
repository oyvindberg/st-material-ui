package com.olvind.mui.muiJoy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sliderSliderClassesMod {
  
  @JSImport("@mui/joy/Slider/sliderClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/joy/Slider/sliderClasses", JSImport.Default)
  @js.native
  val default: SliderClasses = js.native
  
  inline def getSliderUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSliderUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type SliderClassKey = "root" | "marked" | "vertical" | "disabled" | "dragging" | "focusVisible" | "rail" | "track" | "trackFalse" | "trackInverted" | "thumb" | "valueLabel" | "valueLabelOpen" | "mark" | "markActive" | "markLabel" | "colorPrimary" | "colorNeutral" | "colorDanger" | "colorInfo" | "colorSuccess" | "colorWarning" | "sizeSm" | "sizeMd" | "sizeLg"
  
  trait SliderClasses extends StObject {
    
    /** Styles applied to the root element if `color="danger"`. */
    var colorDanger: String
    
    /** Styles applied to the root element if `color="info"`. */
    var colorInfo: String
    
    /** Styles applied to the root element if `color="neutral"`. */
    var colorNeutral: String
    
    /** Styles applied to the root element if `color="primary"`. */
    var colorPrimary: String
    
    /** Styles applied to the root element if `color="success"`. */
    var colorSuccess: String
    
    /** Styles applied to the root element if `color="warning"`. */
    var colorWarning: String
    
    /** State class applied to the root and thumb element if `disabled={true}`. */
    var disabled: String
    
    /** State class applied to the root if a thumb is being dragged. */
    var dragging: String
    
    /** State class applied to the thumb element if it has keyboard focused. */
    var focusVisible: String
    
    /** Class name applied to the mark element. */
    var mark: String
    
    /** Class name applied to the mark element when it is active. */
    var markActive: String
    
    /** Class name applied to the mark label element. */
    var markLabel: String
    
    /** Class name applied to the root element if `marks` is provided with at least one label. */
    var marked: String
    
    /** Class name applied to the rail element. */
    var rail: String
    
    /** Class name applied to the root element. */
    var root: String
    
    /** Styles applied to the root element if `size="lg"`. */
    var sizeLg: String
    
    /** Styles applied to the root element if `size="md"`. */
    var sizeMd: String
    
    /** Styles applied to the root element if `size="sm"`. */
    var sizeSm: String
    
    /** Class name applied to the thumb element. */
    var thumb: String
    
    /** Class name applied to the track element. */
    var track: String
    
    /** Class name applied to the root element if `track={false}`. */
    var trackFalse: String
    
    /** Class name applied to the root element if `track="inverted"`. */
    var trackInverted: String
    
    /** Class name applied to the thumb label element. */
    var valueLabel: String
    
    /** Class name applied to the thumb label element if it's open. */
    var valueLabelOpen: String
    
    /** Class name applied to the root element if `orientation="vertical"`. */
    var vertical: String
  }
  object SliderClasses {
    
    inline def apply(
      colorDanger: String,
      colorInfo: String,
      colorNeutral: String,
      colorPrimary: String,
      colorSuccess: String,
      colorWarning: String,
      disabled: String,
      dragging: String,
      focusVisible: String,
      mark: String,
      markActive: String,
      markLabel: String,
      marked: String,
      rail: String,
      root: String,
      sizeLg: String,
      sizeMd: String,
      sizeSm: String,
      thumb: String,
      track: String,
      trackFalse: String,
      trackInverted: String,
      valueLabel: String,
      valueLabelOpen: String,
      vertical: String
    ): SliderClasses = {
      val __obj = js.Dynamic.literal(colorDanger = colorDanger.asInstanceOf[js.Any], colorInfo = colorInfo.asInstanceOf[js.Any], colorNeutral = colorNeutral.asInstanceOf[js.Any], colorPrimary = colorPrimary.asInstanceOf[js.Any], colorSuccess = colorSuccess.asInstanceOf[js.Any], colorWarning = colorWarning.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], dragging = dragging.asInstanceOf[js.Any], focusVisible = focusVisible.asInstanceOf[js.Any], mark = mark.asInstanceOf[js.Any], markActive = markActive.asInstanceOf[js.Any], markLabel = markLabel.asInstanceOf[js.Any], marked = marked.asInstanceOf[js.Any], rail = rail.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], sizeLg = sizeLg.asInstanceOf[js.Any], sizeMd = sizeMd.asInstanceOf[js.Any], sizeSm = sizeSm.asInstanceOf[js.Any], thumb = thumb.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any], trackFalse = trackFalse.asInstanceOf[js.Any], trackInverted = trackInverted.asInstanceOf[js.Any], valueLabel = valueLabel.asInstanceOf[js.Any], valueLabelOpen = valueLabelOpen.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any])
      __obj.asInstanceOf[SliderClasses]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SliderClasses] (val x: Self) extends AnyVal {
      
      inline def setColorDanger(value: String): Self = StObject.set(x, "colorDanger", value.asInstanceOf[js.Any])
      
      inline def setColorInfo(value: String): Self = StObject.set(x, "colorInfo", value.asInstanceOf[js.Any])
      
      inline def setColorNeutral(value: String): Self = StObject.set(x, "colorNeutral", value.asInstanceOf[js.Any])
      
      inline def setColorPrimary(value: String): Self = StObject.set(x, "colorPrimary", value.asInstanceOf[js.Any])
      
      inline def setColorSuccess(value: String): Self = StObject.set(x, "colorSuccess", value.asInstanceOf[js.Any])
      
      inline def setColorWarning(value: String): Self = StObject.set(x, "colorWarning", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDragging(value: String): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
      
      inline def setFocusVisible(value: String): Self = StObject.set(x, "focusVisible", value.asInstanceOf[js.Any])
      
      inline def setMark(value: String): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
      
      inline def setMarkActive(value: String): Self = StObject.set(x, "markActive", value.asInstanceOf[js.Any])
      
      inline def setMarkLabel(value: String): Self = StObject.set(x, "markLabel", value.asInstanceOf[js.Any])
      
      inline def setMarked(value: String): Self = StObject.set(x, "marked", value.asInstanceOf[js.Any])
      
      inline def setRail(value: String): Self = StObject.set(x, "rail", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setSizeLg(value: String): Self = StObject.set(x, "sizeLg", value.asInstanceOf[js.Any])
      
      inline def setSizeMd(value: String): Self = StObject.set(x, "sizeMd", value.asInstanceOf[js.Any])
      
      inline def setSizeSm(value: String): Self = StObject.set(x, "sizeSm", value.asInstanceOf[js.Any])
      
      inline def setThumb(value: String): Self = StObject.set(x, "thumb", value.asInstanceOf[js.Any])
      
      inline def setTrack(value: String): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
      
      inline def setTrackFalse(value: String): Self = StObject.set(x, "trackFalse", value.asInstanceOf[js.Any])
      
      inline def setTrackInverted(value: String): Self = StObject.set(x, "trackInverted", value.asInstanceOf[js.Any])
      
      inline def setValueLabel(value: String): Self = StObject.set(x, "valueLabel", value.asInstanceOf[js.Any])
      
      inline def setValueLabelOpen(value: String): Self = StObject.set(x, "valueLabelOpen", value.asInstanceOf[js.Any])
      
      inline def setVertical(value: String): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    }
  }
}
