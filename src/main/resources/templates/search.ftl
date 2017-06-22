<div class="container">
    <div style="margin-top:5px; padding:0px; border:1px solid #d1d1d1; height:80px; border-radius:5px; text-align:center">
        <form class="form-inline" style="margin:25px auto; padding:0px;">
            <div class="form-group">
                <input type="text" id="destination"  name="destination" value="${destinationName}" placeholder="您感兴趣的城市"
                       data-toggle="autocomplete" data-service-url="getCity.json" class="form-control" style="width:250px;border-radius:12px;"/>
            </div>
            <div class="form-group input-daterange" data-toggle="datepicker" >
                <input type="text" id="chekIn" value="${checkIn}" class="form-control input-date" placeholder="入住日期"  /> -
                <input type="text" id="checkOut" value="${checkOut}" class="form-control input-date" placeholder="退房日期" />
            </div>
            <div class="form-group">
                <select class="form-control" style="width:100px" name="peopleNum">
                    <option value="1">人数</option>
                    <option value="1">1人</option>
                    <option value="1">2人</option>
                    <option value="1">3人</option>
                </select>
            </div>
            <button type="submit" class="btn btn-primary" style="width:120px">搜索</button>
        </form>
    </div>
</div>